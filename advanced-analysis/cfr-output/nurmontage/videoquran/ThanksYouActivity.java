/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package hazem.nurmontage.videoquran;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat$Type;
import hazem.nurmontage.videoquran.Base;
import hazem.nurmontage.videoquran.R$drawable;
import hazem.nurmontage.videoquran.R$id;
import hazem.nurmontage.videoquran.R$layout;
import hazem.nurmontage.videoquran.R$string;
import hazem.nurmontage.videoquran.ThanksYouActivity$$ExternalSyntheticLambda0;
import hazem.nurmontage.videoquran.ThanksYouActivity$1;
import hazem.nurmontage.videoquran.ThanksYouActivity$2;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import hazem.nurmontage.videoquran.Utils.MyVibrationHelper;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Position$Relative;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Shape$Circle;
import nl.dionsegijn.konfetti.core.models.Shape$Square;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import nl.dionsegijn.konfetti.xml.image.ImageUtil;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ThanksYouActivity
extends Base {
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;

    static /* bridge */ /* synthetic */ OnBackPressedCallback -$$Nest$fgetonBackPressedCallback(ThanksYouActivity thanksYouActivity) {
        return thanksYouActivity.onBackPressedCallback;
    }

    public ThanksYouActivity() {
        ThanksYouActivity$1 thanksYouActivity$1 = new ThanksYouActivity$1(this, true);
        this.onBackPressedCallback = thanksYouActivity$1;
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

    private void playVibration() {
        MyVibrationHelper myVibrationHelper = new MyVibrationHelper((Context)this);
        myVibrationHelper.vibrate(250L);
    }

    protected void attachBaseContext(Context context) {
        context = LocaleHelper.onAttach(context);
        super.attachBaseContext(context);
    }

    public void explode() {
        Object object = this.getApplicationContext();
        int n = R$drawable.favorite_24px;
        object = ContextCompat.getDrawable((Context)object, n);
        n = 1;
        object = ImageUtil.loadDrawable((Drawable)object, n != 0, n != 0);
        int n2 = R$id.konfettiView;
        KonfettiView konfettiView = (KonfettiView)this.findViewById(n2);
        Object object2 = TimeUnit.MILLISECONDS;
        Integer[] integerArray = new Emitter(2800L, (TimeUnit)((Object)object2));
        integerArray = integerArray.max(300);
        PartyFactory partyFactory = new PartyFactory((EmitterConfig)integerArray);
        integerArray = partyFactory.spread(360);
        int n3 = 3;
        Object object3 = new Shape[n3];
        object2 = Shape$Square.INSTANCE;
        object3[0] = object2;
        object2 = Shape$Circle.INSTANCE;
        object3[n] = object2;
        int n4 = 2;
        object3[n4] = object;
        object = Arrays.asList(object3);
        object = integerArray.shapes((List)object);
        integerArray = new Integer[4];
        integerArray[0] = object3 = Integer.valueOf(16572810);
        integerArray[n] = object3 = Integer.valueOf(16740973);
        Object object4 = 16003181;
        integerArray[n4] = object4;
        object4 = 11832815;
        integerArray[n3] = object4;
        object4 = Arrays.asList(integerArray);
        object = ((PartyFactory)object).colors((List)object4).setSpeedBetween(0.0f, 30.0f);
        object4 = new Position$Relative(0.5, 0.3);
        object = ((PartyFactory)object).position((Position)object4).build();
        konfettiView.start((Party)object);
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        EdgeToEdge.enable(this);
        int n = R$layout.activity_thanks_you;
        this.setContentView(n);
        n = R$id.main;
        object = this.findViewById(n);
        Object object2 = new ThanksYouActivity$$ExternalSyntheticLambda0();
        ViewCompat.setOnApplyWindowInsetsListener((View)object, (OnApplyWindowInsetsListener)object2);
        object = this.getOnBackPressedDispatcher();
        object2 = this.onBackPressedCallback;
        ((OnBackPressedDispatcher)object).addCallback(this, (OnBackPressedCallback)object2);
        n = -1;
        this.setStatusBarColor(n);
        object = this.getResources();
        this.mResources = object;
        object = this.getIntent();
        if (object != null) {
            object = this.getIntent().getStringExtra("price");
            int n2 = R$id.tv_price_donate;
            object2 = (TextCustumFont)this.findViewById(n2);
            Object object3 = this.mResources;
            int n3 = R$string.donate_hint;
            object3 = object3.getString(n3);
            object = new Object[]{object};
            object = String.format((String)object3, (Object[])object);
            object2.setText((CharSequence)object);
            n = R$id.tv_thnks_donate;
            object = (TextCustumFont)this.findViewById(n);
            object2 = this.mResources;
            int n4 = R$string.thanks_hint;
            object2 = object2.getString(n4);
            object.setText((CharSequence)object2);
        }
        this.explode();
        n = R$id.btn_on_back;
        object = this.findViewById(n);
        object2 = new ThanksYouActivity$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    protected void onResume() {
        super.onResume();
        this.playVibration();
    }
}
