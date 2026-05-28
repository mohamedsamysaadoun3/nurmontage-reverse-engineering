package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.arthenica.ffmpegkit.StreamInformation;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.WordProcessor;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter;
import hazem.nurmontage.videoquran.model.WordModel;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TextEditActivity extends Base {
    private int endIndex;
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(true) { // from class: hazem.nurmontage.videoquran.TextEditActivity.1
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            TextEditActivity.this.setResult(-1, null);
            TextEditActivity.this.finish();
        }
    };
    private int startIndex;
    private WordAyaAdabter wordAyaAdabter;

    public static int findFirstDigitIndex(String textValue) {
        if (textValue != null && !textValue.isEmpty()) {
            for (int value = 0; value < textValue.length(); value++) {
                if (Character.isDigit(textValue.charAt(value))) {
                    return value;
                }
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(LocaleHelper.onAttach(context));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        setContentView(C2014R.layout.activity_text_edit);
        getOnBackPressedDispatcher().addCallback(this, this.onBackPressedCallback);
        setStatusBarColor(-13421771);
        setNavigationBarColor(-13421771);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(C2014R.id.main), new OnApplyWindowInsetsListener() { // from class: hazem.nurmontage.videoquran.TextEditActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return TextEditActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        findViewById(C2014R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.TextEditActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TextEditActivity.this.onBackPressedCallback.handleOnBackPressed();
            }
        });
        ButtonCustumFont buttonCustumFont = (ButtonCustumFont) findViewById(C2014R.id.btn_done);
        buttonCustumFont.setText(getResources().getString(C2014R.string.done));
        buttonCustumFont.setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.TextEditActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                String selectedAya = TextEditActivity.this.getSelectedAya();
                int findFirstDigitIndex = TextEditActivity.findFirstDigitIndex(selectedAya);
                intent.putExtra("start_index", TextEditActivity.this.startIndex);
                intent.putExtra("end_index", TextEditActivity.this.endIndex);
                if (findFirstDigitIndex == -1) {
                    intent.putExtra("aya", selectedAya);
                } else {
                    String substring = selectedAya.substring(0, findFirstDigitIndex);
                    try {
                        int parseInt = Integer.parseInt(selectedAya.substring(findFirstDigitIndex));
                        if (parseInt > 286) {
                            parseInt = 286;
                        }
                        intent.putExtra("number", parseInt);
                        intent.putExtra(StreamInformation.KEY_INDEX, findFirstDigitIndex);
                        intent.putExtra("aya", substring + " نص");
                    } catch (Exception unused) {
                        intent.putExtra("aya", substring);
                    }
                }
                TextEditActivity.this.setResult(-1, intent);
                TextEditActivity.this.finish();
            }
        });
        String stringExtra = getIntent().getStringExtra("aya");
        String stringExtra2 = getIntent().getStringExtra("complete_aya");
        this.startIndex = getIntent().getIntExtra("start_index", -1);
        this.endIndex = getIntent().getIntExtra("end_index", -1);
        if (stringExtra2 != null) {
            init(stringExtra, stringExtra2);
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSelectedAya() {
        StringBuilder sb = new StringBuilder();
        List<WordModel> list = this.wordAyaAdabter.getList();
        this.startIndex = -1;
        int value = 0;
        for (int value2 = 0; value2 < list.size(); value2++) {
            WordModel wordModel = list.get(value2);
            if (wordModel.isSelected()) {
                if (this.startIndex == -1) {
                    this.startIndex = value2;
                }
                value++;
                sb.append(wordModel.getW()).append(" ");
            }
        }
        int i3 = this.startIndex;
        this.endIndex = value + 1 + i3;
        if (i3 != -1) {
            this.startIndex = WordProcessor.mapIndexAfterGroupReverse(i3, 4, list.size());
            this.endIndex = WordProcessor.mapIndexAfterGroupReverse(this.endIndex, 4, list.size());
        }
        return sb.toString().trim();
    }

    private void init(String textValue, String textValue2) {
        WordProcessor wordProcessor = new WordProcessor();
        String[] split = textValue2.trim().split("\\s+");
        ArrayList arrayList = new ArrayList();
        if (this.startIndex == this.endIndex) {
            String[] split2 = textValue.split("\\s+");
            int indexOf = textValue2.indexOf(textValue);
            boolean z = indexOf == 0;
            int value = 0;
            int value2 = 0;
            for (String textValue3 : split) {
                if (!z) {
                    if (value == indexOf) {
                        z = true;
                    }
                    value += textValue3.length() + 1;
                }
                if (z && value2 < split2.length) {
                    boolean equals = textValue3.equals(split2[value2]);
                    arrayList.add(new WordModel(textValue3, equals));
                    if (equals) {
                        value2++;
                    }
                } else {
                    arrayList.add(new WordModel(textValue3, false));
                }
            }
        } else {
            int i3 = 0;
            while (i3 < split.length) {
                arrayList.add(new WordModel(split[i3], i3 >= this.startIndex && i3 < this.endIndex));
                i3++;
            }
        }
        this.wordAyaAdabter = new WordAyaAdabter(wordProcessor.reverseInGroupsOfFour(arrayList));
        RecyclerView recyclerView = (RecyclerView) findViewById(C2014R.id.f358rv);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.wordAyaAdabter);
    }
}
