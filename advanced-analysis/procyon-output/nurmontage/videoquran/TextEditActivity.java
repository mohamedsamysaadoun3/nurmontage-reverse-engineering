// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.content.Intent;
import androidx.core.view.WindowInsetsControllerCompat;
import hazem.nurmontage.videoquran.views.ButtonCustumFont;
import android.view.View$OnClickListener;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import hazem.nurmontage.videoquran.Utils.WordProcessor;
import hazem.nurmontage.videoquran.model.WordModel;
import hazem.nurmontage.videoquran.adabter.WordAyaAdabter;
import androidx.activity.OnBackPressedCallback;

public class TextEditActivity extends Base
{
    private int endIndex;
    private final OnBackPressedCallback onBackPressedCallback;
    private int startIndex;
    private WordAyaAdabter wordAyaAdabter;
    
    public TextEditActivity() {
        this.onBackPressedCallback = new TextEditActivity$1(this, true);
    }
    
    public static int findFirstDigitIndex(final String s) {
        final int n = -1;
        if (s != null) {
            if (!s.isEmpty()) {
                for (int i = 0; i < s.length(); ++i) {
                    if (Character.isDigit(s.charAt(i))) {
                        return i;
                    }
                }
            }
        }
        return n;
    }
    
    private String getSelectedAya() {
        final StringBuilder sb = new StringBuilder();
        final List list = this.wordAyaAdabter.getList();
        final int startIndex = -1;
        this.startIndex = startIndex;
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final WordModel wordModel = list.get(i);
            if (wordModel.isSelected()) {
                if (this.startIndex == startIndex) {
                    this.startIndex = i;
                }
                ++n;
                sb.append(wordModel.getW()).append(" ");
            }
            ++i;
        }
        final int n2 = n + 1;
        final int startIndex2 = this.startIndex;
        this.endIndex = n2 + startIndex2;
        if (startIndex2 != startIndex) {
            final int size = list.size();
            final int n3 = 4;
            this.startIndex = WordProcessor.mapIndexAfterGroupReverse(startIndex2, n3, size);
            this.endIndex = WordProcessor.mapIndexAfterGroupReverse(this.endIndex, n3, list.size());
        }
        return sb.toString().trim();
    }
    
    private void init(final String str, final String s) {
        final WordProcessor wordProcessor = new WordProcessor();
        final String trim = s.trim();
        final String s2 = "\\s+";
        final String[] split = trim.split(s2);
        final ArrayList list = new ArrayList();
        final int startIndex = this.startIndex;
        final int endIndex = this.endIndex;
        final int hasFixedSize = 1;
        if (startIndex == endIndex) {
            final String[] split2 = str.split(s2);
            final int index = s.indexOf(str);
            int n;
            if (index == 0) {
                n = hasFixedSize;
            }
            else {
                n = 0;
            }
            final int length = split.length;
            int i = 0;
            int n2 = 0;
            int n3 = 0;
            while (i < length) {
                final String s3 = split[i];
                if (n == 0) {
                    if (n2 == index) {
                        n = hasFixedSize;
                    }
                    n2 += s3.length() + hasFixedSize;
                }
                if (n != 0 && n3 < split2.length) {
                    final boolean equals = s3.equals(split2[n3]);
                    list.add(new WordModel(s3, equals));
                    if (equals) {
                        ++n3;
                    }
                }
                else {
                    list.add(new WordModel(s3, false));
                }
                ++i;
            }
        }
        else {
            for (int j = 0; j < split.length; ++j) {
                final String s4 = split[j];
                int n4;
                if (j >= this.startIndex && j < this.endIndex) {
                    n4 = hasFixedSize;
                }
                else {
                    n4 = 0;
                }
                list.add(new WordModel(s4, (boolean)(n4 != 0)));
            }
        }
        this.wordAyaAdabter = new WordAyaAdabter(wordProcessor.reverseInGroupsOfFour(list));
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R$id.rv);
        recyclerView.setLayoutManager((RecyclerView$LayoutManager)new GridLayoutManager((Context)this, 4));
        recyclerView.setHasFixedSize((boolean)(hasFixedSize != 0));
        recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
        recyclerView.setAdapter((RecyclerView$Adapter)this.wordAyaAdabter);
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_text_edit);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        final int n = -13421771;
        this.setStatusBarColor(n);
        this.setNavigationBarColor(n);
        final WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.getWindow(), this.getWindow().getDecorView());
        insetsController.setAppearanceLightStatusBars(false);
        insetsController.setAppearanceLightNavigationBars(false);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new TextEditActivity$$ExternalSyntheticLambda0());
        this.findViewById(R$id.btn_cancel).setOnClickListener((View$OnClickListener)new TextEditActivity$2(this));
        final ButtonCustumFont buttonCustumFont = (ButtonCustumFont)this.findViewById(R$id.btn_done);
        buttonCustumFont.setText((CharSequence)this.getResources().getString(R$string.done));
        buttonCustumFont.setOnClickListener((View$OnClickListener)new TextEditActivity$3(this));
        final String stringExtra = this.getIntent().getStringExtra("aya");
        final String stringExtra2 = this.getIntent().getStringExtra("complete_aya");
        final Intent intent = this.getIntent();
        final int n2 = -1;
        this.startIndex = intent.getIntExtra("start_index", n2);
        this.endIndex = this.getIntent().getIntExtra("end_index", n2);
        if (stringExtra2 != null) {
            this.init(stringExtra, stringExtra2);
        }
    }
}
