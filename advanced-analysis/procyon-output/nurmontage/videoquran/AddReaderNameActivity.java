// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View$OnClickListener;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import android.widget.EditText;

public class AddReaderNameActivity extends Base
{
    private EditText editText;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public AddReaderNameActivity() {
        this.onBackPressedCallback = new AddReaderNameActivity$1(this, true);
    }
    
    public void closeKeyboard() {
        final String s = "input_method";
        try {
            final Object systemService = this.getSystemService(s);
            try {
                final InputMethodManager inputMethodManager = (InputMethodManager)systemService;
                try {
                    final EditText editText = this.editText;
                    try {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                    catch (final Exception ex) {
                        ex.printStackTrace();
                    }
                }
                catch (final Exception ex2) {}
            }
            catch (final Exception ex3) {}
        }
        catch (final Exception ex4) {}
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_add_reader_name);
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new AddReaderNameActivity$$ExternalSyntheticLambda0());
        this.hideSystemBars();
        this.findViewById(R$id.btn_cancel).setOnClickListener((View$OnClickListener)new AddReaderNameActivity$2(this));
        this.findViewById(R$id.btn_done).setOnClickListener((View$OnClickListener)new AddReaderNameActivity$3(this));
        (this.editText = (EditText)this.findViewById(R$id.edt_reader)).requestFocus();
        final String stringExtra = this.getIntent().getStringExtra("name");
        if (stringExtra != null && stringExtra.length() > 3) {
            this.editText.setText((CharSequence)stringExtra);
        }
        this.showKeyboard();
    }
    
    protected void onDestroy() {
        super.onDestroy();
    }
    
    protected void onPause() {
        this.closeKeyboard();
        super.onPause();
    }
    
    public void showKeyboard() {
        final String s = "input_method";
        try {
            final Object systemService = this.getSystemService(s);
            try {
                final InputMethodManager inputMethodManager = (InputMethodManager)systemService;
                try {
                    inputMethodManager.showSoftInput((View)this.editText, 1);
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {}
    }
}
