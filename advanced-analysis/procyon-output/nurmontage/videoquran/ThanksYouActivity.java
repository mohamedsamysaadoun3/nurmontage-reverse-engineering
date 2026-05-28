// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import android.view.View$OnClickListener;
import hazem.nurmontage.videoquran.views.TextCustumFont;
import androidx.lifecycle.LifecycleOwner;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import nl.dionsegijn.konfetti.core.models.Shape$DrawableShape;
import android.graphics.drawable.Drawable;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Position$Relative;
import java.util.List;
import java.util.Arrays;
import nl.dionsegijn.konfetti.core.models.Shape$Circle;
import nl.dionsegijn.konfetti.core.models.Shape$Square;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import nl.dionsegijn.konfetti.xml.image.ImageUtil;
import androidx.core.content.ContextCompat;
import hazem.nurmontage.videoquran.Utils.LocaleHelper;
import android.content.Context;
import hazem.nurmontage.videoquran.Utils.MyVibrationHelper;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat$Type;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import android.content.res.Resources;

public class ThanksYouActivity extends Base
{
    private Resources mResources;
    private final OnBackPressedCallback onBackPressedCallback;
    
    public ThanksYouActivity() {
        this.onBackPressedCallback = new ThanksYouActivity$1(this, true);
    }
    
    private void playVibration() {
        new MyVibrationHelper((Context)this).vibrate(250L);
    }
    
    protected void attachBaseContext(Context onAttach) {
        onAttach = LocaleHelper.onAttach(onAttach);
        super.attachBaseContext(onAttach);
    }
    
    public void explode() {
        final Drawable drawable = ContextCompat.getDrawable(this.getApplicationContext(), R$drawable.favorite_24px);
        final int n = 1;
        final Shape$DrawableShape loadDrawable = ImageUtil.loadDrawable(drawable, (boolean)(n != 0), (boolean)(n != 0));
        final KonfettiView konfettiView = (KonfettiView)this.findViewById(R$id.konfettiView);
        final PartyFactory spread = new PartyFactory(new Emitter(2800L, TimeUnit.MILLISECONDS).max(300)).spread(360);
        final int n2 = 3;
        final Shape[] a = new Shape[n2];
        a[0] = (Shape)Shape$Square.INSTANCE;
        a[n] = (Shape)Shape$Circle.INSTANCE;
        final int n3 = 2;
        a[n3] = (Shape)loadDrawable;
        final PartyFactory shapes = spread.shapes((List)Arrays.asList(a));
        final Integer[] a2 = new Integer[4];
        a2[0] = 16572810;
        a2[n] = 16740973;
        a2[n3] = 16003181;
        a2[n2] = 11832815;
        konfettiView.start(shapes.colors((List)Arrays.asList(a2)).setSpeedBetween(0.0f, 30.0f).position((Position)new Position$Relative(0.5, 0.3)).build());
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable((ComponentActivity)this);
        this.setContentView(R$layout.activity_thanks_you);
        ViewCompat.setOnApplyWindowInsetsListener(this.findViewById(R$id.main), (OnApplyWindowInsetsListener)new ThanksYouActivity$$ExternalSyntheticLambda0());
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, this.onBackPressedCallback);
        this.setStatusBarColor(-1);
        this.mResources = this.getResources();
        if (this.getIntent() != null) {
            ((TextCustumFont)this.findViewById(R$id.tv_price_donate)).setText((CharSequence)String.format(this.mResources.getString(R$string.donate_hint), this.getIntent().getStringExtra("price")));
            ((TextCustumFont)this.findViewById(R$id.tv_thnks_donate)).setText((CharSequence)this.mResources.getString(R$string.thanks_hint));
        }
        this.explode();
        this.findViewById(R$id.btn_on_back).setOnClickListener((View$OnClickListener)new ThanksYouActivity$2(this));
    }
    
    protected void onResume() {
        super.onResume();
        this.playVibration();
    }
}
