/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.Window
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.TextEditActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.TextEditActivity$1;
import hazem.nurmontage.videoquran.TextEditActivity$2;
import hazem.nurmontage.videoquran.TextEditActivity$3;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.WordProcessor;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter;
import hazem.nurmontage.videoquran.model.WordModel;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TextEditActivity
extends Base {
    private int endIndex;
    private final OnBackPressedCallback onBackPressedCallback;
    private int startIndex;
    private WordAyaAdabter wordAyaAdabter;

    static /* bridge */ /* synthetic */ int -$$Nest$fgetendIndex(TextEditActivity textEditActivity) {
        return textEditActivity.endIndex;
    }

    static /* bridge */ /* synthetic */ OnBackPressedCallback -$$Nest$fgetonBackPressedCallback(TextEditActivity textEditActivity) {
        return textEditActivity.onBackPressedCallback;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetstartIndex(TextEditActivity textEditActivity) {
        return textEditActivity.startIndex;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$mgetSelectedAya(TextEditActivity textEditActivity) {
        return textEditActivity.getSelectedAya();
    }

    public TextEditActivity() {
        TextEditActivity$1 textEditActivity$1 = new TextEditActivity$1(this, true);
        this.onBackPressedCallback = textEditActivity$1;
    }

    public static int findFirstDigitIndex(String string) {
        int n;
        int n2 = -1;
        if (string != null && (n = string.isEmpty()) == 0) {
            int n3;
            for (n = 0; n < (n3 = string.length()); ++n) {
                n3 = Character.isDigit(string.charAt(n)) ? 1 : 0;
                if (n3 == 0) continue;
                return n;
            }
        }
        return n2;
    }

    private String getSelectedAya() {
        int n;
        int n2;
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        List list = this.wordAyaAdabter.getList();
        this.startIndex = n3 = -1;
        int n4 = 0;
        for (n2 = 0; n2 < (n = list.size()); ++n2) {
            Object object = (WordModel)list.get(n2);
            int n5 = ((WordModel)object).isSelected();
            if (n5 == 0) continue;
            n5 = this.startIndex;
            if (n5 == n3) {
                this.startIndex = n2;
            }
            ++n4;
            object = ((WordModel)object).getW();
            object = stringBuilder.append((String)object);
            String string = " ";
            ((StringBuilder)object).append(string);
        }
        ++n4;
        n2 = this.startIndex;
        this.endIndex = n4 += n2;
        if (n2 != n3) {
            n3 = list.size();
            n4 = 4;
            this.startIndex = n3 = WordProcessor.mapIndexAfterGroupReverse(n2, n4, n3);
            n3 = this.endIndex;
            int n6 = list.size();
            this.endIndex = n6 = WordProcessor.mapIndexAfterGroupReverse(n3, n4, n6);
        }
        return stringBuilder.toString().trim();
    }

    private void init(String object, String object2) {
        int n;
        WordProcessor wordProcessor = new WordProcessor();
        String[] stringArray = ((String)object2).trim();
        Object object3 = "\\s+";
        stringArray = stringArray.split((String)object3);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n2 = this.startIndex;
        int n3 = this.endIndex;
        int n4 = 1;
        if (n2 == n3) {
            int n5;
            object3 = ((String)object).split((String)object3);
            n = ((String)object2).indexOf((String)object);
            if (n == 0) {
                n5 = n4;
            } else {
                n5 = 0;
                object2 = null;
            }
            n2 = stringArray.length;
            int n6 = 0;
            int n7 = 0;
            for (n3 = 0; n3 < n2; ++n3) {
                Object object4;
                int n8;
                String string = stringArray[n3];
                if (n5 == 0) {
                    if (n6 == n) {
                        n5 = n4;
                    }
                    n8 = string.length() + n4;
                    n6 += n8;
                }
                if (n5 != 0 && n7 < (n8 = ((String[])object3).length)) {
                    object4 = object3[n7];
                    n8 = string.equals(object4) ? 1 : 0;
                    WordModel wordModel = new WordModel(string, n8 != 0);
                    arrayList.add(wordModel);
                    if (n8 == 0) continue;
                    ++n7;
                    continue;
                }
                object4 = new WordModel(string, false);
                arrayList.add(object4);
            }
        } else {
            int n9;
            object = null;
            for (n = 0; n < (n9 = stringArray.length); ++n) {
                object3 = stringArray[n];
                n2 = this.startIndex;
                n2 = n >= n2 && n < (n2 = this.endIndex) ? n4 : 0;
                object2 = new WordModel((String)object3, n2 != 0);
                arrayList.add(object2);
            }
        }
        object = wordProcessor.reverseInGroupsOfFour(arrayList);
        this.wordAyaAdabter = object2 = new WordAyaAdabter((List)object);
        n = R$id.rv;
        object = (RecyclerView)this.findViewById(n);
        object2 = new GridLayoutManager((Context)this, 4);
        ((RecyclerView)object).setLayoutManager((RecyclerView$LayoutManager)object2);
        ((RecyclerView)object).setHasFixedSize(n4 != 0);
        ((RecyclerView)object).setItemAnimator(null);
        object2 = this.wordAyaAdabter;
        ((RecyclerView)object).setAdapter((RecyclerView$Adapter)object2);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat$Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        int n = R$layout.activity_text_edit;
        this.setContentView(n);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        n = -13421771;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        object = this.getWindow();
        object2 = this.getWindow().getDecorView();
        object = WindowCompat.getInsetsController((Window)object, (View)object2);
        ((WindowInsetsControllerCompat)object).setAppearanceLightStatusBars(false);
        ((WindowInsetsControllerCompat)object).setAppearanceLightNavigationBars(false);
        n = R$id.main;
        object = this.findViewById(n);
        object2 = new TextEditActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        n = R$id.btn_cancel;
        object = this.findViewById(n);
        object2 = new TextEditActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n = R$id.btn_done;
        object = (ButtonCustumFont)this.findViewById(n);
        object2 = this.getResources();
        int n2 = R$string.done;
        object2 = object2.getString(n2);
        object.setText((CharSequence)object2);
        object2 = new TextEditActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.getIntent().getStringExtra("aya");
        object2 = this.getIntent().getStringExtra("complete_aya");
        Intent intent = this.getIntent();
        int n3 = -1;
        this.startIndex = n2 = intent.getIntExtra("start_index", n3);
        intent = this.getIntent();
        String string2 = "end_index";
        this.endIndex = n2 = intent.getIntExtra(string2, n3);
        if (object2 != null) {
            this.init((String)object, (String)object2);
        }
    }
}
