/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  androidx.activity.ComponentActivity
 *  androidx.activity.EdgeToEdge
 *  androidx.activity.OnBackPressedCallback
 *  androidx.core.graphics.Insets
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.ViewCompat
 *  androidx.core.view.WindowInsetsCompat
 *  androidx.core.view.WindowInsetsCompat$Type
 *  androidx.lifecycle.LifecycleOwner
 */
package hazem.nurmontage.videoquran;

import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import hazem.nurmontage.videoquran.AddReaderNameActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.AddReaderNameActivity$1;
import hazem.nurmontage.videoquran.AddReaderNameActivity$2;
import hazem.nurmontage.videoquran.AddReaderNameActivity$3;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;

public class AddReaderNameActivity
extends Base {
    private EditText editText;
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ EditText cfr_renamed_402(AddReaderNameActivity addReaderNameActivity) {
        return addReaderNameActivity.editText;
    }

    static /* bridge */ /* synthetic */ OnBackPressedCallback cfr_renamed_91(AddReaderNameActivity addReaderNameActivity) {
        return addReaderNameActivity.onBackPressedCallback;
    }

    public AddReaderNameActivity() {
        AddReaderNameActivity$1 addReaderNameActivity$1 = new AddReaderNameActivity$1(this, true);
        this.onBackPressedCallback = addReaderNameActivity$1;
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int n = WindowInsetsCompat.Type.systemBars();
        Insets insets = windowInsetsCompat.getInsets(n);
        int n2 = insets.left;
        int n3 = insets.top;
        int n4 = insets.right;
        n = insets.bottom;
        view.setPadding(n2, n3, n4, n);
        return windowInsetsCompat;
    }

    public void closeKeyboard() {
        Object object = "input_method";
        object = this.getSystemService((String)object);
        object = (InputMethodManager)object;
        EditText editText = this.editText;
        editText = editText.getWindowToken();
        try {
            object.hideSoftInputFromWindow((IBinder)editText, 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void onCreate(Bundle object) {
        int n;
        int n2;
        super.onCreate((Bundle)object);
        EdgeToEdge.enable((ComponentActivity)this);
        int n3 = R$layout.activity_add_reader_name;
        this.setContentView(n3);
        object = this.getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        object.addCallback((LifecycleOwner)this, object2);
        n3 = R$id.main;
        object = this.findViewById(n3);
        object2 = new AddReaderNameActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        this.hideSystemBars();
        n3 = R$id.btn_cancel;
        object = this.findViewById(n3);
        object2 = new AddReaderNameActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.btn_done;
        object = this.findViewById(n3);
        object2 = new AddReaderNameActivity$3(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.edt_reader;
        object = (EditText)this.findViewById(n3);
        this.editText = object;
        object.requestFocus();
        object = this.getIntent();
        object2 = "name";
        object = object.getStringExtra((String)object2);
        if (object != null && (n2 = ((String)object).length()) > (n = 3)) {
            object2 = this.editText;
            object2.setText((CharSequence)object);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void showKeyboard() {
        Object object = "input_method";
        try {
            object = this.getSystemService((String)object);
        }
        catch (Exception exception) {
            return;
        }
        object = (InputMethodManager)object;
        EditText editText = this.editText;
        int n = 1;
        object.showSoftInput((View)editText, n);
    }
}

