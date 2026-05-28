package hazem.nurmontage.videoquran.adabter;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.signature.ObjectKey;
import hazem.nurmontage.videoquran.C2014R;
import java.util.List;

/* loaded from: classes2.dex */
public class AboutAdabters extends RecyclerView.Adapter<ViewHolder> {
    private final String APP_VERSION;
    private final Context mContext;
    private final int mDimensionH;
    private final int mDimensionW;
    private final List<ModelAbout> mModelAboutList;

    public AboutAdabters(Context context, String textValue, List<ModelAbout> list, int index, int index0) {
        this.mContext = context;
        this.mModelAboutList = list;
        this.mDimensionW = index;
        this.mDimensionH = index0;
        this.APP_VERSION = textValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int index) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2014R.layout.row_billing, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int index) {
        ModelAbout modelAbout = this.mModelAboutList.get(index);
        viewHolder.textView.setGravity(modelAbout.geGravity());
        if (modelAbout.getSizeText() == 19) {
            viewHolder.textView.getPaint().setFakeBoldText(true);
        } else {
            viewHolder.textView.getPaint().setFakeBoldText(false);
        }
        viewHolder.textView.setTextSize(2, modelAbout.getSizeText());
        viewHolder.textView.setText(HtmlCompat.fromHtml(modelAbout.getText(), 0));
        if (modelAbout.getImage_1() != -1) {
            viewHolder.imageView_1.setVisibility(0);
            Glide.with(this.mContext).asBitmap().load(Integer.valueOf(modelAbout.getImage_1())).override(this.mDimensionW, this.mDimensionH).centerInside().signature(new ObjectKey(this.APP_VERSION)).diskCacheStrategy(DiskCacheStrategy.NONE).into(viewHolder.imageView_1);
        } else {
            viewHolder.imageView_1.setVisibility(8);
            Glide.with(this.mContext).clear(viewHolder.imageView_1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ModelAbout> list = this.mModelAboutList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView_1;
        public TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(C2014R.id.f359tv);
            this.imageView_1 = (ImageView) view.findViewById(C2014R.id.img);
        }
    }

    public static class ModelAbout {
        private int image_1;
        private int image_2;
        private int sizeText;
        private Pair<String, Integer> text;

        public ModelAbout(Pair<String, Integer> pair, int size) {
            this.image_2 = -1;
            this.sizeText = 16;
            this.text = pair;
            this.image_1 = size;
        }

        public ModelAbout(int size, Pair<String, Integer> pair, int size7) {
            this.image_2 = -1;
            this.text = pair;
            this.image_1 = size7;
            this.sizeText = size;
        }

        public ModelAbout(int size, int size8, Pair<String, Integer> pair) {
            this.sizeText = 16;
            this.text = pair;
            this.image_1 = size;
            this.image_2 = size8;
        }

        public ModelAbout(Pair<String, Integer> pair) {
            this.image_1 = -1;
            this.image_2 = -1;
            this.sizeText = 16;
            this.text = pair;
        }

        public ModelAbout(Pair<String, Integer> pair, int size, int size10) {
            this.image_2 = -1;
            this.text = pair;
            this.sizeText = size10;
            this.image_1 = size;
        }

        public ModelAbout(int size, Pair<String, Integer> pair) {
            this.image_1 = -1;
            this.image_2 = -1;
            this.text = pair;
            this.sizeText = size;
        }

        public int getImage_1() {
            return this.image_1;
        }

        public int getImage_2() {
            return this.image_2;
        }

        public int getSizeText() {
            return this.sizeText;
        }

        public String getText() {
            return (String) this.text.first;
        }

        public int geGravity() {
            return ((Integer) this.text.second).intValue();
        }
    }
}
