// 
// Decompiled by Procyon v0.6.0
// 

package hazem.nurmontage.videoquran.fragment;

import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.R$id;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import hazem.nurmontage.videoquran.adabter.IconQuranAdabters$IIconQuranCallback;
import hazem.nurmontage.videoquran.databinding.FragmentFontBinding;
import androidx.fragment.app.Fragment;

public class EditIconQuranFragment extends Fragment
{
    public static EditIconQuranFragment instance;
    private FragmentFontBinding fragmentBinding;
    private EditIconQuranFragment$IQuranIconCallback iQuranIconCallback;
    private String icon;
    private IconQuranAdabters$IIconQuranCallback iconQuranCallback;
    private String last_icon;
    
    public EditIconQuranFragment() {
        this.iconQuranCallback = new EditIconQuranFragment$3(this);
    }
    
    public EditIconQuranFragment(final EditIconQuranFragment$IQuranIconCallback iQuranIconCallback, final String s) {
        this.iconQuranCallback = new EditIconQuranFragment$3(this);
        this.iQuranIconCallback = iQuranIconCallback;
        this.icon = s;
        this.last_icon = s;
    }
    
    public static EditIconQuranFragment getInstance(final EditIconQuranFragment$IQuranIconCallback editIconQuranFragment$IQuranIconCallback, final String s) {
        if (EditIconQuranFragment.instance == null) {
            EditIconQuranFragment.instance = new EditIconQuranFragment(editIconQuranFragment$IQuranIconCallback, s);
        }
        return EditIconQuranFragment.instance;
    }
    
    public View onCreateView(LayoutInflater root, final ViewGroup viewGroup, final Bundle bundle) {
        final FragmentFontBinding inflate = FragmentFontBinding.inflate(root, viewGroup, false);
        this.fragmentBinding = inflate;
        root = (LayoutInflater)inflate.getRoot();
        try {
            final View viewById = ((View)root).findViewById(R$id.rv);
            try {
                final RecyclerView recyclerView = (RecyclerView)viewById;
                try {
                    try {
                        final LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext(), 0, false);
                        final RecyclerView recyclerView2 = recyclerView;
                        try {
                            recyclerView2.setLayoutManager((RecyclerView$LayoutManager)layoutManager);
                            recyclerView.setItemAnimator((RecyclerView$ItemAnimator)null);
                            recyclerView.setHasFixedSize(true);
                            try {
                                final ArrayList list = new ArrayList();
                                list.add("hafes");
                                list.add("shamerli");
                                list.add("nour_hode");
                                list.add("amiri");
                                try {
                                    final IconQuranAdabters$IIconQuranCallback iconQuranCallback = this.iconQuranCallback;
                                    try {
                                        final IconQuranAdabters adapter = new IconQuranAdabters(iconQuranCallback, list, list.indexOf(this.icon));
                                        Label_0224: {
                                            if (adapter.getSelect() == -1) {
                                                break Label_0224;
                                            }
                                            final Object value = list.get(adapter.getSelect());
                                            try {
                                                this.icon = (String)value;
                                                final RecyclerView recyclerView3 = recyclerView;
                                                try {
                                                    recyclerView3.setAdapter((RecyclerView$Adapter)adapter);
                                                    final View viewById2 = ((View)root).findViewById(R$id.btn_done);
                                                    try {
                                                        final EditIconQuranFragment$1 onClickListener = new EditIconQuranFragment$1(this);
                                                        final View view = viewById2;
                                                        try {
                                                            view.setOnClickListener((View$OnClickListener)onClickListener);
                                                            final View viewById3 = ((View)root).findViewById(R$id.btn_cancel);
                                                            try {
                                                                final EditIconQuranFragment$2 onClickListener2 = new EditIconQuranFragment$2(this);
                                                                final View view2 = viewById3;
                                                                try {
                                                                    view2.setOnClickListener((View$OnClickListener)onClickListener2);
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
        return (View)root;
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        this.iconQuranCallback = null;
        this.fragmentBinding = null;
        this.iQuranIconCallback = null;
        EditIconQuranFragment.instance = null;
    }
}
