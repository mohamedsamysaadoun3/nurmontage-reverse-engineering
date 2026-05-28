// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import hazem.nurmontage.videoquran.Utils.QuranPreference;
import android.widget.Spinner;
import java.util.Collection;
import java.util.ArrayList;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class AddQuranFragment$10 implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ AddQuranFragment this$0;
    
    AddQuranFragment$10(final AddQuranFragment this$0) {
        this.this$0 = this$0;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, int n, final long n2) {
        if (n == AddQuranFragment.-$$Nest$fgetcurrent_pos(this.this$0)) {
            return;
        }
        int n3;
        if (AddQuranFragment.-$$Nest$fgetisInit(this.this$0)) {
            n3 = AddQuranFragment.-$$Nest$fgetarrayCount(this.this$0)[AddQuranFragment.-$$Nest$fgetquranPreference(this.this$0).getSurah()];
        }
        else {
            n3 = AddQuranFragment.-$$Nest$fgetarrayCount(this.this$0)[n];
        }
        final ArrayList<String> list = new ArrayList<String>();
        int i;
        for (n = (i = 1); i <= n3; ++i) {
            list.add(String.valueOf(i));
        }
        AddQuranFragment.-$$Nest$fgetadapterFromAyah(this.this$0).clear();
        AddQuranFragment.-$$Nest$fgetadapterFromAyah(this.this$0).addAll((Collection)list);
        AddQuranFragment.-$$Nest$fgetadapterToAyah(this.this$0).clear();
        AddQuranFragment.-$$Nest$fgetadapterToAyah(this.this$0).addAll((Collection)list);
        if (AddQuranFragment.-$$Nest$fgetisInit(this.this$0)) {
            try {
                final AddQuranFragment this$0 = this.this$0;
                try {
                    final Spinner -$$Nest$fgetspinnerSurah = AddQuranFragment.-$$Nest$fgetspinnerSurah(this$0);
                    try {
                        final AddQuranFragment this$2 = this.this$0;
                        try {
                            final QuranPreference -$$Nest$fgetquranPreference = AddQuranFragment.-$$Nest$fgetquranPreference(this$2);
                            try {
                                -$$Nest$fgetspinnerSurah.setSelection(-$$Nest$fgetquranPreference.getSurah(), (boolean)(n != 0));
                                final AddQuranFragment this$3 = this.this$0;
                                try {
                                    final Spinner -$$Nest$fgetspinner = AddQuranFragment.-$$Nest$fgetspinnerFrom(this$3);
                                    try {
                                        final AddQuranFragment this$4 = this.this$0;
                                        try {
                                            final QuranPreference -$$Nest$fgetquranPreference2 = AddQuranFragment.-$$Nest$fgetquranPreference(this$4);
                                            try {
                                                n = -$$Nest$fgetquranPreference2.getFrom();
                                                -$$Nest$fgetspinner.setSelection(n, false);
                                                final AddQuranFragment this$5 = this.this$0;
                                                try {
                                                    final Spinner -$$Nest$fgetspinnerTo = AddQuranFragment.-$$Nest$fgetspinnerTo(this$5);
                                                    try {
                                                        final AddQuranFragment this$6 = this.this$0;
                                                        try {
                                                            final QuranPreference -$$Nest$fgetquranPreference3 = AddQuranFragment.-$$Nest$fgetquranPreference(this$6);
                                                            try {
                                                                n = -$$Nest$fgetquranPreference3.getTo();
                                                                -$$Nest$fgetspinnerTo.setSelection(n, false);
                                                                final AddQuranFragment this$7 = this.this$0;
                                                                try {
                                                                    final Spinner -$$Nest$fgetspinnerReciters = AddQuranFragment.-$$Nest$fgetspinnerReciters(this$7);
                                                                    try {
                                                                        final AddQuranFragment this$8 = this.this$0;
                                                                        try {
                                                                            final QuranPreference -$$Nest$fgetquranPreference4 = AddQuranFragment.-$$Nest$fgetquranPreference(this$8);
                                                                            try {
                                                                                n = -$$Nest$fgetquranPreference4.getNameReader();
                                                                                -$$Nest$fgetspinnerReciters.setSelection(n, false);
                                                                                final AddQuranFragment this$9 = this.this$0;
                                                                                try {
                                                                                    final Spinner -$$Nest$fgetspinnerTranslation = AddQuranFragment.-$$Nest$fgetspinnerTranslation(this$9);
                                                                                    try {
                                                                                        final AddQuranFragment this$10 = this.this$0;
                                                                                        try {
                                                                                            final QuranPreference -$$Nest$fgetquranPreference5 = AddQuranFragment.-$$Nest$fgetquranPreference(this$10);
                                                                                            try {
                                                                                                n = -$$Nest$fgetquranPreference5.getTranslation();
                                                                                                -$$Nest$fgetspinnerTranslation.setSelection(n, false);
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
                                        catch (final Exception ex14) {}
                                    }
                                    catch (final Exception ex15) {}
                                }
                                catch (final Exception ex16) {}
                            }
                            catch (final Exception ex17) {}
                        }
                        catch (final Exception ex18) {}
                    }
                    catch (final Exception ex19) {}
                }
                catch (final Exception ex20) {}
            }
            catch (final Exception ex21) {}
            AddQuranFragment.-$$Nest$fputisInit(this.this$0, false);
        }
        else {
            AddQuranFragment.-$$Nest$fgetspinnerTo(this.this$0).setSelection(0, false);
            AddQuranFragment.-$$Nest$fgetspinnerFrom(this.this$0).setSelection(0, false);
        }
        final AddQuranFragment this$11 = this.this$0;
        AddQuranFragment.-$$Nest$fputcurrent_pos(this$11, AddQuranFragment.-$$Nest$fgetspinnerSurah(this$11).getSelectedItemPosition());
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
