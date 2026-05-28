package hazem.nurmontage.videoquran.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hazem.nurmontage.videoquran.C2014R;
import hazem.nurmontage.videoquran.Utils.Utils;
import hazem.nurmontage.videoquran.adabter.ColorAdabter;
import hazem.nurmontage.videoquran.common.Common;
import hazem.nurmontage.videoquran.constant.AyaTextPreset;
import hazem.nurmontage.videoquran.databinding.FragmentColorAyaBinding;
import hazem.nurmontage.videoquran.fragment.EditTrslEntityFragment;
import hazem.nurmontage.videoquran.model.TranslationQuranEntity;
import hazem.nurmontage.videoquran.views.TextCustumFont;

/* loaded from: classes2.dex */
public class ColorTrslAyaFragment extends Fragment {
    public static ColorTrslAyaFragment instance;
    private ColorAdabter adapter;
    private FragmentColorAyaBinding binding;
    private TranslationQuranEntity entity_select;
    private ColorAdabter.IColor iColor = new ColorAdabter.IColor() { // from class: hazem.nurmontage.videoquran.fragment.ColorTrslAyaFragment.2
        @Override // hazem.nurmontage.videoquran.adabter.ColorAdabter.IColor
        public void onColor(int ayaNumber, int color2) {
            if (ColorTrslAyaFragment.this.iEditEntityCallback == null) {
                return;
            }
            ColorTrslAyaFragment.this.scrollToSelectedPosition();
            ColorTrslAyaFragment.this.iEditEntityCallback.updateAya(ayaNumber);
        }
    };
    private EditTrslEntityFragment.IEditEntityCallback iEditEntityCallback;
    private RecyclerView recyclerView;
    private Resources resources;

    public static ColorTrslAyaFragment getInstance(EditTrslEntityFragment.IEditEntityCallback iEditEntityCallback, TranslationQuranEntity translationQuranEntity, Resources resources) {
        if (instance == null) {
            instance = new ColorTrslAyaFragment(iEditEntityCallback, translationQuranEntity, resources);
        }
        return instance;
    }

    public ColorTrslAyaFragment(EditTrslEntityFragment.IEditEntityCallback iEditEntityCallback, TranslationQuranEntity translationQuranEntity, Resources resources) {
        this.iEditEntityCallback = iEditEntityCallback;
        this.entity_select = translationQuranEntity;
        this.resources = resources;
    }

    public ColorTrslAyaFragment() {
    }

    private void setupPresetButtons(View view) {
        TextCustumFont textCustumFont = (TextCustumFont) view.findViewById(C2014R.id.btnNone);
        TextCustumFont textCustumFont2 = (TextCustumFont) view.findViewById(C2014R.id.btnOutline);
        TextCustumFont textCustumFont3 = (TextCustumFont) view.findViewById(C2014R.id.btnShadow);
        TextCustumFont textCustumFont4 = (TextCustumFont) view.findViewById(C2014R.id.btnGlow);
        textCustumFont.setText(this.resources.getString(C2014R.string.preset_none));
        textCustumFont2.setText(this.resources.getString(C2014R.string.preset_outline));
        textCustumFont3.setText(this.resources.getString(C2014R.string.preset_shadow));
        textCustumFont4.setText(this.resources.getString(C2014R.string.preset_glow));
        int value = 0;
        final TextView[] textViewArr = {textCustumFont, textCustumFont2, textCustumFont3, textCustumFont4};
        final AyaTextPreset[] ayaTextPresetArr = {AyaTextPreset.NONE, AyaTextPreset.OUTLINE, AyaTextPreset.SHADOW, AyaTextPreset.GLOW};
        for (final int color2 = 0; color2 < 4; color2++) {
            textViewArr[color2].setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.fragment.ColorTrslAyaFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ColorTrslAyaFragment.this.m643x3c6612f6(textViewArr, color2, ayaTextPresetArr, view2);
                }
            });
        }
        TranslationQuranEntity translationQuranEntity = this.entity_select;
        AyaTextPreset ayaTextPreset = translationQuranEntity.get(translationQuranEntity.getmPreset());
        if (ayaTextPreset != AyaTextPreset.NONE) {
            if (ayaTextPreset == AyaTextPreset.OUTLINE) {
                value = 1;
            } else {
                value = ayaTextPreset == AyaTextPreset.SHADOW ? 2 : 3;
            }
        }
        selectPreset(textViewArr, value);
    }

    /* renamed from: lambda$setupPresetButtons$0$hazem-nurmontage-videoquran-fragment-ColorTrslAyaFragment */
    /* synthetic */ void m643x3c6612f6(TextView[] textViewArr, int ayaNumber, AyaTextPreset[] ayaTextPresetArr, View view) {
        selectPreset(textViewArr, ayaNumber);
        EditTrslEntityFragment.IEditEntityCallback iEditEntityCallback = this.iEditEntityCallback;
        if (iEditEntityCallback != null) {
            iEditEntityCallback.updatePreset(ayaTextPresetArr[ayaNumber]);
        }
    }

    private void selectPreset(TextView[] textViewArr, int count) {
        int color2 = 0;
        while (color2 < textViewArr.length) {
            textViewArr[color2].setSelected(color2 == count);
            color2++;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentColorAyaBinding inflate = FragmentColorAyaBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        LinearLayout root = inflate.getRoot();
        if (this.iEditEntityCallback != null && this.entity_select != null && this.resources != null) {
            this.recyclerView = (RecyclerView) root.findViewById(C2014R.id.rv_color);
            this.adapter = new ColorAdabter(this.iColor, Common.MUSLIM_AYA_COLORS, Utils.indexOf(Common.MUSLIM_AYA_COLORS, this.entity_select.getClrAya()));
            this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.recyclerView.setItemAnimator(null);
            this.recyclerView.setHasFixedSize(true);
            this.recyclerView.setAdapter(this.adapter);
            if (this.adapter.getPos_select() > 2) {
                scrollToSelectedPosition(this.adapter.getPos_select() - 2);
            }
            root.findViewById(C2014R.id.tab_layout).setVisibility(8);
            setupPresetButtons(root);
            root.findViewById(C2014R.id.btn_done).setOnClickListener(new View.OnClickListener() { // from class: hazem.nurmontage.videoquran.fragment.ColorTrslAyaFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ColorTrslAyaFragment.this.iEditEntityCallback != null) {
                        ColorTrslAyaFragment.this.iEditEntityCallback.onDone();
                    }
                }
            });
        }
        return root;
    }

    public void scrollToSelectedPosition(int width) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(width, this.recyclerView.getWidth() / 2);
        }
    }

    public void scrollToSelectedPosition() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(this.adapter.getPos_select(), (this.recyclerView.getWidth() / 2) - 50);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.binding = null;
        instance = null;
        this.iColor = null;
        super.onDestroyView();
    }
}
