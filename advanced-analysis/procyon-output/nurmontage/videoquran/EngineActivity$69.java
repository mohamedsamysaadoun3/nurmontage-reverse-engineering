// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran;

import hazem.nurmontage.videoquran.fragment.AddQuranFragment$IAddQuran;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import android.net.Uri;
import hazem.nurmontage.videoquran.fragment.AddQuranFragment;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

class EngineActivity$69 implements ActivityResultCallback
{
    final /* synthetic */ EngineActivity this$0;
    
    EngineActivity$69(final EngineActivity this$0) {
        this.this$0 = this$0;
    }
    
    public void onActivityResult(final ActivityResult activityResult) {
        EngineActivity.-$$Nest$fputisToCrop(this.this$0, false);
        final Intent data = activityResult.getData();
        if (data == null) {
            return;
        }
        final AddQuranFragment instance = AddQuranFragment.instance;
        final String s = "name";
        final String s2 = "path_video_copy";
        final String s3 = "audio";
        if (instance != null) {
            AddQuranFragment.instance.setNameReader(data.getStringExtra(s), Uri.parse(data.getStringExtra(s3)), data.getStringExtra(s2));
            return;
        }
        final Intent intent = data;
        try {
            final String stringExtra = intent.getStringExtra(s3);
            try {
                final Uri parse = Uri.parse(stringExtra);
                final String stringExtra2 = data.getStringExtra(s2);
                final String stringExtra3 = data.getStringExtra(s);
                try {
                    final EngineActivity this$0 = this.this$0;
                    try {
                        final FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                        try {
                            final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                            try {
                                final EngineActivity this$2 = this.this$0;
                                try {
                                    final AddQuranFragment$IAddQuran -$$Nest$fgetiAddQuran = EngineActivity.-$$Nest$fgetiAddQuran(this$2);
                                    try {
                                        final EngineActivity this$3 = this.this$0;
                                        try {
                                            EngineActivity.-$$Nest$fputmCurrentFragment(this$2, (Fragment)AddQuranFragment.getInstance(-$$Nest$fgetiAddQuran, EngineActivity.-$$Nest$fgetmResources(this$3), parse, stringExtra2, stringExtra3));
                                            final int container = R$id.m_container;
                                            try {
                                                final EngineActivity this$4 = this.this$0;
                                                try {
                                                    beginTransaction.replace(container, EngineActivity.-$$Nest$fgetmCurrentFragment(this$4));
                                                    beginTransaction.commit();
                                                    final EngineActivity this$5 = this.this$0;
                                                    try {
                                                        final EngineActivity$69$1 engineActivity$69$1 = new EngineActivity$69$1(this);
                                                        final EngineActivity engineActivity = this$5;
                                                        try {
                                                            engineActivity.runOnUiThread((Runnable)engineActivity$69$1);
                                                        }
                                                        catch (final Exception ex) {}
                                                    }
                                                    catch (final Exception ex2) {}
                                                }
                                                catch (final Exception ex3) {}
                                            }
                                            catch (final Exception ex4) {}
                                        }
                                        catch (final Exception ex5) {}
                                    }
                                    catch (final Exception ex6) {}
                                }
                                catch (final Exception ex7) {}
                            }
                            catch (final Exception ex8) {}
                        }
                        catch (final Exception ex9) {}
                    }
                    catch (final Exception ex10) {}
                }
                catch (final Exception ex11) {}
            }
            catch (final Exception ex12) {}
        }
        catch (final Exception ex13) {}
    }
}
