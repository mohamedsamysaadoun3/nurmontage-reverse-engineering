package androidx.media3.p002ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.C0366C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.Util;
import androidx.media3.p002ui.PlayerControlView;
import androidx.media3.p002ui.TimeBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private static final String TAG = "PlayerControlView";
    private long[] adGroupTimesMs;
    private final View audioTrackButton;
    private final AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private final Class<?> compositionPlayerClazz;
    private final Method compositionPlayerIsScrubbingModeEnabledMethod;
    private final Method compositionPlayerSetScrubbingModeEnabledMethod;
    private final PlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final TextView durationView;
    private final Class<?> exoplayerClazz;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final ImageView fullscreenButton;
    private final String fullscreenEnterContentDescription;
    private final Drawable fullscreenEnterDrawable;
    private final String fullscreenExitContentDescription;
    private final Drawable fullscreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullscreen;
    private final Method isScrubbingModeEnabledMethod;
    private final ImageView minimalFullscreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final ImageView nextButton;
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Drawable pauseButtonDrawable;
    private final Timeline.Period period;
    private final Drawable playButtonDrawable;
    private final ImageView playPauseButton;
    private final PlaybackSpeedAdapter playbackSpeedAdapter;
    private final View playbackSpeedButton;
    private boolean[] playedAdGroups;
    private Player player;
    private final TextView positionView;
    private final ImageView previousButton;
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final Resources resources;
    private final View rewindButton;
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private final Method setScrubbingModeEnabledMethod;
    private final SettingsAdapter settingsAdapter;
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final TextTrackSelectionAdapter textTrackSelectionAdapter;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private boolean timeBarScrubbingEnabled;
    private final TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final ImageView vrButton;
    private final Timeline.Window window;

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z);
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    @Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        final PlayerControlView playerControlView;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i16;
        int i17;
        int i18;
        String str;
        String str2;
        Class<?> cls;
        Method method;
        int i19;
        Method method2;
        Class<?> cls2;
        Method method3;
        Method method4;
        ImageView imageView;
        View findViewById;
        View findViewById2;
        View findViewById3;
        TimeBar timeBar;
        int i20;
        int i21;
        ImageView imageView2;
        boolean z9;
        int i22;
        boolean z10;
        final PlayerControlView playerControlView2;
        boolean z11;
        int i23;
        TimeBar timeBar2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        boolean z12;
        View view;
        ImageView imageView7;
        View view2;
        ImageView imageView8;
        ImageView imageView9;
        ImageView imageView10;
        int i24 = C0628R.layout.exo_player_control_view;
        int i25 = C0628R.drawable.exo_styled_controls_play;
        int i26 = C0628R.drawable.exo_styled_controls_pause;
        int i27 = C0628R.drawable.exo_styled_controls_next;
        int i28 = C0628R.drawable.exo_styled_controls_simple_fastforward;
        int i29 = C0628R.drawable.exo_styled_controls_previous;
        int i30 = C0628R.drawable.exo_styled_controls_simple_rewind;
        int i31 = C0628R.drawable.exo_styled_controls_fullscreen_exit;
        int i32 = C0628R.drawable.exo_styled_controls_fullscreen_enter;
        int i33 = C0628R.drawable.exo_styled_controls_repeat_off;
        int i34 = C0628R.drawable.exo_styled_controls_repeat_one;
        int i35 = C0628R.drawable.exo_styled_controls_repeat_all;
        int i36 = C0628R.drawable.exo_styled_controls_shuffle_on;
        int i37 = C0628R.drawable.exo_styled_controls_shuffle_off;
        int i38 = C0628R.drawable.exo_styled_controls_subtitle_on;
        int i39 = C0628R.drawable.exo_styled_controls_subtitle_off;
        int i40 = C0628R.drawable.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C0628R.styleable.PlayerControlView, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_controller_layout_id, i24);
                int resourceId2 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_play_icon, i25);
                int resourceId3 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_pause_icon, i26);
                int resourceId4 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_next_icon, i27);
                int resourceId5 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_fastforward_icon, i28);
                int resourceId6 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_previous_icon, i29);
                int resourceId7 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_rewind_icon, i30);
                int resourceId8 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_fullscreen_exit_icon, i31);
                int resourceId9 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_fullscreen_enter_icon, i32);
                int resourceId10 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_repeat_off_icon, i33);
                int resourceId11 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_repeat_one_icon, i34);
                int resourceId12 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_repeat_all_icon, i35);
                int resourceId13 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_shuffle_on_icon, i36);
                int resourceId14 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_shuffle_off_icon, i37);
                int resourceId15 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_subtitle_on_icon, i38);
                int resourceId16 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_subtitle_off_icon, i39);
                int resourceId17 = obtainStyledAttributes.getResourceId(C0628R.styleable.PlayerControlView_vr_icon, i40);
                playerControlView = this;
                try {
                    playerControlView.showTimeoutMs = obtainStyledAttributes.getInt(C0628R.styleable.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                    playerControlView.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, playerControlView.repeatToggleModes);
                    boolean z13 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_show_rewind_button, true);
                    boolean z14 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_show_fastforward_button, true);
                    boolean z15 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_show_previous_button, true);
                    boolean z16 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_show_next_button, true);
                    boolean z17 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_show_shuffle_button, false);
                    boolean z18 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_show_subtitle_button, false);
                    boolean z19 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_show_vr_button, false);
                    playerControlView.timeBarScrubbingEnabled = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_time_bar_scrubbing_enabled, false);
                    playerControlView.setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C0628R.styleable.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                    boolean z20 = obtainStyledAttributes.getBoolean(C0628R.styleable.PlayerControlView_animation_enabled, true);
                    obtainStyledAttributes.recycle();
                    i4 = resourceId;
                    i5 = resourceId3;
                    i6 = resourceId4;
                    i7 = resourceId5;
                    i8 = resourceId6;
                    i9 = resourceId7;
                    i10 = resourceId8;
                    i11 = resourceId9;
                    i12 = resourceId10;
                    i13 = resourceId11;
                    i2 = resourceId2;
                    i16 = resourceId17;
                    z5 = z13;
                    z6 = z14;
                    z7 = z15;
                    z8 = z16;
                    z = z17;
                    z2 = z18;
                    z3 = z19;
                    i17 = resourceId13;
                    z4 = z20;
                    i14 = resourceId14;
                    i15 = resourceId16;
                    i18 = resourceId12;
                    i3 = resourceId15;
                } catch (Throwable th) {
                    th = th;
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            playerControlView = this;
            i2 = i25;
            i3 = i38;
            i4 = i24;
            i5 = i26;
            i6 = i27;
            i7 = i28;
            i8 = i29;
            i9 = i30;
            i10 = i31;
            i11 = i32;
            i12 = i33;
            i13 = i34;
            i14 = i37;
            i15 = i39;
            z = false;
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
            i16 = i40;
            i17 = i36;
            i18 = i35;
        }
        LayoutInflater.from(context).inflate(i4, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        playerControlView.componentListener = new ComponentListener();
        playerControlView.visibilityListeners = new CopyOnWriteArrayList<>();
        playerControlView.period = new Timeline.Period();
        playerControlView.window = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        playerControlView.formatBuilder = sb;
        int i41 = i14;
        playerControlView.formatter = new Formatter(sb, Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new Runnable() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PlayerControlView.this.updateProgress();
            }
        };
        try {
            cls = Class.forName("androidx.media3.exoplayer.ExoPlayer");
            try {
                str2 = "setScrubbingModeEnabled";
                try {
                    Method method5 = cls.getMethod(str2, Boolean.TYPE);
                    try {
                        str = "isScrubbingModeEnabled";
                        try {
                            i19 = i16;
                            method2 = cls.getMethod(str, new Class[0]);
                            method = method5;
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                            method = method5;
                            i19 = i16;
                            method2 = null;
                            playerControlView.exoplayerClazz = cls;
                            playerControlView.setScrubbingModeEnabledMethod = method;
                            playerControlView.isScrubbingModeEnabledMethod = method2;
                            cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
                            Class<?>[] clsArr = new Class[1];
                            clsArr[0] = Boolean.TYPE;
                            method3 = cls2.getMethod(str2, clsArr);
                            try {
                                method4 = cls2.getMethod(str, new Class[0]);
                            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                                method4 = null;
                                playerControlView.compositionPlayerClazz = cls2;
                                playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method3;
                                playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method4;
                                playerControlView.durationView = (TextView) playerControlView.findViewById(C0628R.id.exo_duration);
                                playerControlView.positionView = (TextView) playerControlView.findViewById(C0628R.id.exo_position);
                                imageView = (ImageView) playerControlView.findViewById(C0628R.id.exo_subtitle);
                                playerControlView.subtitleButton = imageView;
                                if (imageView != null) {
                                }
                                ImageView imageView11 = (ImageView) playerControlView.findViewById(C0628R.id.exo_fullscreen);
                                playerControlView.fullscreenButton = imageView11;
                                initializeFullscreenButton(imageView11, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        PlayerControlView.this.onFullscreenButtonClicked(view3);
                                    }
                                });
                                ImageView imageView12 = (ImageView) playerControlView.findViewById(C0628R.id.exo_minimal_fullscreen);
                                playerControlView.minimalFullscreenButton = imageView12;
                                initializeFullscreenButton(imageView12, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        PlayerControlView.this.onFullscreenButtonClicked(view3);
                                    }
                                });
                                findViewById = playerControlView.findViewById(C0628R.id.exo_settings);
                                playerControlView.settingsButton = findViewById;
                                if (findViewById != null) {
                                }
                                findViewById2 = playerControlView.findViewById(C0628R.id.exo_playback_speed);
                                playerControlView.playbackSpeedButton = findViewById2;
                                if (findViewById2 != null) {
                                }
                                findViewById3 = playerControlView.findViewById(C0628R.id.exo_audio_track);
                                playerControlView.audioTrackButton = findViewById3;
                                if (findViewById3 != null) {
                                }
                                timeBar = (TimeBar) playerControlView.findViewById(C0628R.id.exo_progress);
                                View findViewById4 = playerControlView.findViewById(C0628R.id.exo_progress_placeholder);
                                if (timeBar != null) {
                                }
                                timeBar2 = playerControlView2.timeBar;
                                if (timeBar2 != null) {
                                }
                                Resources resources = context.getResources();
                                playerControlView2.resources = resources;
                                imageView3 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_play_pause);
                                playerControlView2.playPauseButton = imageView3;
                                if (imageView3 != null) {
                                }
                                imageView4 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_prev);
                                playerControlView2.previousButton = imageView4;
                                if (imageView4 != null) {
                                }
                                imageView5 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_next);
                                playerControlView2.nextButton = imageView5;
                                if (imageView5 != null) {
                                }
                                Typeface font = ResourcesCompat.getFont(context, C0628R.font.roboto_medium_numbers);
                                imageView6 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_rew);
                                TextView textView = (TextView) playerControlView2.findViewById(C0628R.id.exo_rew_with_amount);
                                if (imageView6 != null) {
                                }
                                view = playerControlView2.rewindButton;
                                if (view != null) {
                                }
                                imageView7 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_ffwd);
                                TextView textView2 = (TextView) playerControlView2.findViewById(C0628R.id.exo_ffwd_with_amount);
                                if (imageView7 != null) {
                                }
                                view2 = playerControlView2.fastForwardButton;
                                if (view2 != null) {
                                }
                                imageView8 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_repeat_toggle);
                                playerControlView2.repeatToggleButton = imageView8;
                                if (imageView8 != null) {
                                }
                                imageView9 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_shuffle);
                                playerControlView2.shuffleButton = imageView9;
                                if (imageView9 != null) {
                                }
                                playerControlView2.buttonAlphaEnabled = resources.getInteger(C0628R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                                playerControlView2.buttonAlphaDisabled = resources.getInteger(C0628R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                                imageView10 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_vr);
                                playerControlView2.vrButton = imageView10;
                                if (imageView10 != null) {
                                }
                                PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(playerControlView2);
                                playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager;
                                playerControlViewLayoutManager.setAnimationEnabled(z4);
                                SettingsAdapter settingsAdapter = playerControlView2.new SettingsAdapter(new String[]{resources.getString(C0628R.string.exo_controls_playback_speed), resources.getString(C0628R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources, C0628R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources, C0628R.drawable.exo_styled_controls_audiotrack)});
                                playerControlView2.settingsAdapter = settingsAdapter;
                                playerControlView2.settingsWindowMargin = resources.getDimensionPixelSize(C0628R.dimen.exo_settings_offset);
                                RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(C0628R.layout.exo_styled_settings_list, (ViewGroup) null);
                                playerControlView2.settingsView = recyclerView;
                                recyclerView.setAdapter(settingsAdapter);
                                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                                PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                                playerControlView2.settingsWindow = popupWindow;
                                popupWindow.setOnDismissListener(playerControlView2.componentListener);
                                playerControlView2.needToHideBars = true;
                                playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
                                playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources, i21);
                                playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources, i20);
                                playerControlView2.subtitleOnContentDescription = resources.getString(C0628R.string.exo_controls_cc_enabled_description);
                                playerControlView2.subtitleOffContentDescription = resources.getString(C0628R.string.exo_controls_cc_disabled_description);
                                playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
                                playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
                                playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources.getStringArray(C0628R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                                playerControlView2.playButtonDrawable = Util.getDrawable(context, resources, i2);
                                playerControlView2.pauseButtonDrawable = Util.getDrawable(context, resources, i5);
                                playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, resources, i10);
                                playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, resources, i11);
                                playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, resources, i12);
                                playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, resources, i13);
                                playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, resources, i18);
                                playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, resources, i17);
                                playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, resources, i22);
                                playerControlView2.fullscreenExitContentDescription = resources.getString(C0628R.string.exo_controls_fullscreen_exit_description);
                                playerControlView2.fullscreenEnterContentDescription = resources.getString(C0628R.string.exo_controls_fullscreen_enter_description);
                                playerControlView2.repeatOffButtonContentDescription = resources.getString(C0628R.string.exo_controls_repeat_off_description);
                                playerControlView2.repeatOneButtonContentDescription = resources.getString(C0628R.string.exo_controls_repeat_one_description);
                                playerControlView2.repeatAllButtonContentDescription = resources.getString(C0628R.string.exo_controls_repeat_all_description);
                                playerControlView2.shuffleOnContentDescription = resources.getString(C0628R.string.exo_controls_shuffle_on_description);
                                playerControlView2.shuffleOffContentDescription = resources.getString(C0628R.string.exo_controls_shuffle_off_description);
                                playerControlViewLayoutManager.setShowButton((ViewGroup) playerControlView2.findViewById(C0628R.id.exo_bottom_bar), true);
                                playerControlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z6);
                                playerControlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z5);
                                playerControlViewLayoutManager.setShowButton(imageView4, z7);
                                playerControlViewLayoutManager.setShowButton(imageView5, z12);
                                playerControlViewLayoutManager.setShowButton(imageView9, z11);
                                playerControlViewLayoutManager.setShowButton(imageView2, z10);
                                playerControlViewLayoutManager.setShowButton(imageView10, z9);
                                playerControlViewLayoutManager.setShowButton(imageView8, playerControlView2.repeatToggleModes != 0);
                                playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda2
                                    @Override // android.view.View.OnLayoutChangeListener
                                    public final void onLayoutChange(View view3, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49) {
                                        PlayerControlView.this.onLayoutChange(view3, i42, i43, i44, i45, i46, i47, i48, i49);
                                    }
                                });
                            }
                            playerControlView.compositionPlayerClazz = cls2;
                            playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method3;
                            playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method4;
                            playerControlView.durationView = (TextView) playerControlView.findViewById(C0628R.id.exo_duration);
                            playerControlView.positionView = (TextView) playerControlView.findViewById(C0628R.id.exo_position);
                            imageView = (ImageView) playerControlView.findViewById(C0628R.id.exo_subtitle);
                            playerControlView.subtitleButton = imageView;
                            if (imageView != null) {
                            }
                            ImageView imageView112 = (ImageView) playerControlView.findViewById(C0628R.id.exo_fullscreen);
                            playerControlView.fullscreenButton = imageView112;
                            initializeFullscreenButton(imageView112, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    PlayerControlView.this.onFullscreenButtonClicked(view3);
                                }
                            });
                            ImageView imageView122 = (ImageView) playerControlView.findViewById(C0628R.id.exo_minimal_fullscreen);
                            playerControlView.minimalFullscreenButton = imageView122;
                            initializeFullscreenButton(imageView122, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    PlayerControlView.this.onFullscreenButtonClicked(view3);
                                }
                            });
                            findViewById = playerControlView.findViewById(C0628R.id.exo_settings);
                            playerControlView.settingsButton = findViewById;
                            if (findViewById != null) {
                            }
                            findViewById2 = playerControlView.findViewById(C0628R.id.exo_playback_speed);
                            playerControlView.playbackSpeedButton = findViewById2;
                            if (findViewById2 != null) {
                            }
                            findViewById3 = playerControlView.findViewById(C0628R.id.exo_audio_track);
                            playerControlView.audioTrackButton = findViewById3;
                            if (findViewById3 != null) {
                            }
                            timeBar = (TimeBar) playerControlView.findViewById(C0628R.id.exo_progress);
                            View findViewById42 = playerControlView.findViewById(C0628R.id.exo_progress_placeholder);
                            if (timeBar != null) {
                            }
                            timeBar2 = playerControlView2.timeBar;
                            if (timeBar2 != null) {
                            }
                            Resources resources2 = context.getResources();
                            playerControlView2.resources = resources2;
                            imageView3 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_play_pause);
                            playerControlView2.playPauseButton = imageView3;
                            if (imageView3 != null) {
                            }
                            imageView4 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_prev);
                            playerControlView2.previousButton = imageView4;
                            if (imageView4 != null) {
                            }
                            imageView5 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_next);
                            playerControlView2.nextButton = imageView5;
                            if (imageView5 != null) {
                            }
                            Typeface font2 = ResourcesCompat.getFont(context, C0628R.font.roboto_medium_numbers);
                            imageView6 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_rew);
                            TextView textView3 = (TextView) playerControlView2.findViewById(C0628R.id.exo_rew_with_amount);
                            if (imageView6 != null) {
                            }
                            view = playerControlView2.rewindButton;
                            if (view != null) {
                            }
                            imageView7 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_ffwd);
                            TextView textView22 = (TextView) playerControlView2.findViewById(C0628R.id.exo_ffwd_with_amount);
                            if (imageView7 != null) {
                            }
                            view2 = playerControlView2.fastForwardButton;
                            if (view2 != null) {
                            }
                            imageView8 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_repeat_toggle);
                            playerControlView2.repeatToggleButton = imageView8;
                            if (imageView8 != null) {
                            }
                            imageView9 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_shuffle);
                            playerControlView2.shuffleButton = imageView9;
                            if (imageView9 != null) {
                            }
                            playerControlView2.buttonAlphaEnabled = resources2.getInteger(C0628R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                            playerControlView2.buttonAlphaDisabled = resources2.getInteger(C0628R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                            imageView10 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_vr);
                            playerControlView2.vrButton = imageView10;
                            if (imageView10 != null) {
                            }
                            PlayerControlViewLayoutManager playerControlViewLayoutManager2 = new PlayerControlViewLayoutManager(playerControlView2);
                            playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager2;
                            playerControlViewLayoutManager2.setAnimationEnabled(z4);
                            SettingsAdapter settingsAdapter2 = playerControlView2.new SettingsAdapter(new String[]{resources2.getString(C0628R.string.exo_controls_playback_speed), resources2.getString(C0628R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources2, C0628R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources2, C0628R.drawable.exo_styled_controls_audiotrack)});
                            playerControlView2.settingsAdapter = settingsAdapter2;
                            playerControlView2.settingsWindowMargin = resources2.getDimensionPixelSize(C0628R.dimen.exo_settings_offset);
                            RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(C0628R.layout.exo_styled_settings_list, (ViewGroup) null);
                            playerControlView2.settingsView = recyclerView2;
                            recyclerView2.setAdapter(settingsAdapter2);
                            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                            PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
                            playerControlView2.settingsWindow = popupWindow2;
                            popupWindow2.setOnDismissListener(playerControlView2.componentListener);
                            playerControlView2.needToHideBars = true;
                            playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
                            playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources2, i21);
                            playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources2, i20);
                            playerControlView2.subtitleOnContentDescription = resources2.getString(C0628R.string.exo_controls_cc_enabled_description);
                            playerControlView2.subtitleOffContentDescription = resources2.getString(C0628R.string.exo_controls_cc_disabled_description);
                            playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
                            playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
                            playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources2.getStringArray(C0628R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                            playerControlView2.playButtonDrawable = Util.getDrawable(context, resources2, i2);
                            playerControlView2.pauseButtonDrawable = Util.getDrawable(context, resources2, i5);
                            playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, resources2, i10);
                            playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, resources2, i11);
                            playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, resources2, i12);
                            playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, resources2, i13);
                            playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, resources2, i18);
                            playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, resources2, i17);
                            playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, resources2, i22);
                            playerControlView2.fullscreenExitContentDescription = resources2.getString(C0628R.string.exo_controls_fullscreen_exit_description);
                            playerControlView2.fullscreenEnterContentDescription = resources2.getString(C0628R.string.exo_controls_fullscreen_enter_description);
                            playerControlView2.repeatOffButtonContentDescription = resources2.getString(C0628R.string.exo_controls_repeat_off_description);
                            playerControlView2.repeatOneButtonContentDescription = resources2.getString(C0628R.string.exo_controls_repeat_one_description);
                            playerControlView2.repeatAllButtonContentDescription = resources2.getString(C0628R.string.exo_controls_repeat_all_description);
                            playerControlView2.shuffleOnContentDescription = resources2.getString(C0628R.string.exo_controls_shuffle_on_description);
                            playerControlView2.shuffleOffContentDescription = resources2.getString(C0628R.string.exo_controls_shuffle_off_description);
                            playerControlViewLayoutManager2.setShowButton((ViewGroup) playerControlView2.findViewById(C0628R.id.exo_bottom_bar), true);
                            playerControlViewLayoutManager2.setShowButton(playerControlView2.fastForwardButton, z6);
                            playerControlViewLayoutManager2.setShowButton(playerControlView2.rewindButton, z5);
                            playerControlViewLayoutManager2.setShowButton(imageView4, z7);
                            playerControlViewLayoutManager2.setShowButton(imageView5, z12);
                            playerControlViewLayoutManager2.setShowButton(imageView9, z11);
                            playerControlViewLayoutManager2.setShowButton(imageView2, z10);
                            playerControlViewLayoutManager2.setShowButton(imageView10, z9);
                            playerControlViewLayoutManager2.setShowButton(imageView8, playerControlView2.repeatToggleModes != 0);
                            playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda2
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view3, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49) {
                                    PlayerControlView.this.onLayoutChange(view3, i42, i43, i44, i45, i46, i47, i48, i49);
                                }
                            });
                        }
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        str = "isScrubbingModeEnabled";
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    str = "isScrubbingModeEnabled";
                    method = null;
                    i19 = i16;
                    method2 = null;
                    playerControlView.exoplayerClazz = cls;
                    playerControlView.setScrubbingModeEnabledMethod = method;
                    playerControlView.isScrubbingModeEnabledMethod = method2;
                    cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Boolean.TYPE;
                    method3 = cls2.getMethod(str2, clsArr2);
                    method4 = cls2.getMethod(str, new Class[0]);
                    playerControlView.compositionPlayerClazz = cls2;
                    playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method3;
                    playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method4;
                    playerControlView.durationView = (TextView) playerControlView.findViewById(C0628R.id.exo_duration);
                    playerControlView.positionView = (TextView) playerControlView.findViewById(C0628R.id.exo_position);
                    imageView = (ImageView) playerControlView.findViewById(C0628R.id.exo_subtitle);
                    playerControlView.subtitleButton = imageView;
                    if (imageView != null) {
                    }
                    ImageView imageView1122 = (ImageView) playerControlView.findViewById(C0628R.id.exo_fullscreen);
                    playerControlView.fullscreenButton = imageView1122;
                    initializeFullscreenButton(imageView1122, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            PlayerControlView.this.onFullscreenButtonClicked(view3);
                        }
                    });
                    ImageView imageView1222 = (ImageView) playerControlView.findViewById(C0628R.id.exo_minimal_fullscreen);
                    playerControlView.minimalFullscreenButton = imageView1222;
                    initializeFullscreenButton(imageView1222, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            PlayerControlView.this.onFullscreenButtonClicked(view3);
                        }
                    });
                    findViewById = playerControlView.findViewById(C0628R.id.exo_settings);
                    playerControlView.settingsButton = findViewById;
                    if (findViewById != null) {
                    }
                    findViewById2 = playerControlView.findViewById(C0628R.id.exo_playback_speed);
                    playerControlView.playbackSpeedButton = findViewById2;
                    if (findViewById2 != null) {
                    }
                    findViewById3 = playerControlView.findViewById(C0628R.id.exo_audio_track);
                    playerControlView.audioTrackButton = findViewById3;
                    if (findViewById3 != null) {
                    }
                    timeBar = (TimeBar) playerControlView.findViewById(C0628R.id.exo_progress);
                    View findViewById422 = playerControlView.findViewById(C0628R.id.exo_progress_placeholder);
                    if (timeBar != null) {
                    }
                    timeBar2 = playerControlView2.timeBar;
                    if (timeBar2 != null) {
                    }
                    Resources resources22 = context.getResources();
                    playerControlView2.resources = resources22;
                    imageView3 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_play_pause);
                    playerControlView2.playPauseButton = imageView3;
                    if (imageView3 != null) {
                    }
                    imageView4 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_prev);
                    playerControlView2.previousButton = imageView4;
                    if (imageView4 != null) {
                    }
                    imageView5 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_next);
                    playerControlView2.nextButton = imageView5;
                    if (imageView5 != null) {
                    }
                    Typeface font22 = ResourcesCompat.getFont(context, C0628R.font.roboto_medium_numbers);
                    imageView6 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_rew);
                    TextView textView32 = (TextView) playerControlView2.findViewById(C0628R.id.exo_rew_with_amount);
                    if (imageView6 != null) {
                    }
                    view = playerControlView2.rewindButton;
                    if (view != null) {
                    }
                    imageView7 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_ffwd);
                    TextView textView222 = (TextView) playerControlView2.findViewById(C0628R.id.exo_ffwd_with_amount);
                    if (imageView7 != null) {
                    }
                    view2 = playerControlView2.fastForwardButton;
                    if (view2 != null) {
                    }
                    imageView8 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_repeat_toggle);
                    playerControlView2.repeatToggleButton = imageView8;
                    if (imageView8 != null) {
                    }
                    imageView9 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_shuffle);
                    playerControlView2.shuffleButton = imageView9;
                    if (imageView9 != null) {
                    }
                    playerControlView2.buttonAlphaEnabled = resources22.getInteger(C0628R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                    playerControlView2.buttonAlphaDisabled = resources22.getInteger(C0628R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                    imageView10 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_vr);
                    playerControlView2.vrButton = imageView10;
                    if (imageView10 != null) {
                    }
                    PlayerControlViewLayoutManager playerControlViewLayoutManager22 = new PlayerControlViewLayoutManager(playerControlView2);
                    playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager22;
                    playerControlViewLayoutManager22.setAnimationEnabled(z4);
                    SettingsAdapter settingsAdapter22 = playerControlView2.new SettingsAdapter(new String[]{resources22.getString(C0628R.string.exo_controls_playback_speed), resources22.getString(C0628R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources22, C0628R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources22, C0628R.drawable.exo_styled_controls_audiotrack)});
                    playerControlView2.settingsAdapter = settingsAdapter22;
                    playerControlView2.settingsWindowMargin = resources22.getDimensionPixelSize(C0628R.dimen.exo_settings_offset);
                    RecyclerView recyclerView22 = (RecyclerView) LayoutInflater.from(context).inflate(C0628R.layout.exo_styled_settings_list, (ViewGroup) null);
                    playerControlView2.settingsView = recyclerView22;
                    recyclerView22.setAdapter(settingsAdapter22);
                    recyclerView22.setLayoutManager(new LinearLayoutManager(getContext()));
                    PopupWindow popupWindow22 = new PopupWindow((View) recyclerView22, -2, -2, true);
                    playerControlView2.settingsWindow = popupWindow22;
                    popupWindow22.setOnDismissListener(playerControlView2.componentListener);
                    playerControlView2.needToHideBars = true;
                    playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
                    playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources22, i21);
                    playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources22, i20);
                    playerControlView2.subtitleOnContentDescription = resources22.getString(C0628R.string.exo_controls_cc_enabled_description);
                    playerControlView2.subtitleOffContentDescription = resources22.getString(C0628R.string.exo_controls_cc_disabled_description);
                    playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
                    playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
                    playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources22.getStringArray(C0628R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                    playerControlView2.playButtonDrawable = Util.getDrawable(context, resources22, i2);
                    playerControlView2.pauseButtonDrawable = Util.getDrawable(context, resources22, i5);
                    playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, resources22, i10);
                    playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, resources22, i11);
                    playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, resources22, i12);
                    playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, resources22, i13);
                    playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, resources22, i18);
                    playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, resources22, i17);
                    playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, resources22, i22);
                    playerControlView2.fullscreenExitContentDescription = resources22.getString(C0628R.string.exo_controls_fullscreen_exit_description);
                    playerControlView2.fullscreenEnterContentDescription = resources22.getString(C0628R.string.exo_controls_fullscreen_enter_description);
                    playerControlView2.repeatOffButtonContentDescription = resources22.getString(C0628R.string.exo_controls_repeat_off_description);
                    playerControlView2.repeatOneButtonContentDescription = resources22.getString(C0628R.string.exo_controls_repeat_one_description);
                    playerControlView2.repeatAllButtonContentDescription = resources22.getString(C0628R.string.exo_controls_repeat_all_description);
                    playerControlView2.shuffleOnContentDescription = resources22.getString(C0628R.string.exo_controls_shuffle_on_description);
                    playerControlView2.shuffleOffContentDescription = resources22.getString(C0628R.string.exo_controls_shuffle_off_description);
                    playerControlViewLayoutManager22.setShowButton((ViewGroup) playerControlView2.findViewById(C0628R.id.exo_bottom_bar), true);
                    playerControlViewLayoutManager22.setShowButton(playerControlView2.fastForwardButton, z6);
                    playerControlViewLayoutManager22.setShowButton(playerControlView2.rewindButton, z5);
                    playerControlViewLayoutManager22.setShowButton(imageView4, z7);
                    playerControlViewLayoutManager22.setShowButton(imageView5, z12);
                    playerControlViewLayoutManager22.setShowButton(imageView9, z11);
                    playerControlViewLayoutManager22.setShowButton(imageView2, z10);
                    playerControlViewLayoutManager22.setShowButton(imageView10, z9);
                    playerControlViewLayoutManager22.setShowButton(imageView8, playerControlView2.repeatToggleModes != 0);
                    playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49) {
                            PlayerControlView.this.onLayoutChange(view3, i42, i43, i44, i45, i46, i47, i48, i49);
                        }
                    });
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                str = "isScrubbingModeEnabled";
                str2 = "setScrubbingModeEnabled";
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused6) {
            str = "isScrubbingModeEnabled";
            str2 = "setScrubbingModeEnabled";
            cls = null;
        }
        playerControlView.exoplayerClazz = cls;
        playerControlView.setScrubbingModeEnabledMethod = method;
        playerControlView.isScrubbingModeEnabledMethod = method2;
        try {
            cls2 = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                Class<?>[] clsArr22 = new Class[1];
            } catch (ClassNotFoundException | NoSuchMethodException unused7) {
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused8) {
            cls2 = null;
        }
        try {
            clsArr22[0] = Boolean.TYPE;
            method3 = cls2.getMethod(str2, clsArr22);
            method4 = cls2.getMethod(str, new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused9) {
            method3 = null;
            method4 = null;
            playerControlView.compositionPlayerClazz = cls2;
            playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method3;
            playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method4;
            playerControlView.durationView = (TextView) playerControlView.findViewById(C0628R.id.exo_duration);
            playerControlView.positionView = (TextView) playerControlView.findViewById(C0628R.id.exo_position);
            imageView = (ImageView) playerControlView.findViewById(C0628R.id.exo_subtitle);
            playerControlView.subtitleButton = imageView;
            if (imageView != null) {
            }
            ImageView imageView11222 = (ImageView) playerControlView.findViewById(C0628R.id.exo_fullscreen);
            playerControlView.fullscreenButton = imageView11222;
            initializeFullscreenButton(imageView11222, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    PlayerControlView.this.onFullscreenButtonClicked(view3);
                }
            });
            ImageView imageView12222 = (ImageView) playerControlView.findViewById(C0628R.id.exo_minimal_fullscreen);
            playerControlView.minimalFullscreenButton = imageView12222;
            initializeFullscreenButton(imageView12222, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    PlayerControlView.this.onFullscreenButtonClicked(view3);
                }
            });
            findViewById = playerControlView.findViewById(C0628R.id.exo_settings);
            playerControlView.settingsButton = findViewById;
            if (findViewById != null) {
            }
            findViewById2 = playerControlView.findViewById(C0628R.id.exo_playback_speed);
            playerControlView.playbackSpeedButton = findViewById2;
            if (findViewById2 != null) {
            }
            findViewById3 = playerControlView.findViewById(C0628R.id.exo_audio_track);
            playerControlView.audioTrackButton = findViewById3;
            if (findViewById3 != null) {
            }
            timeBar = (TimeBar) playerControlView.findViewById(C0628R.id.exo_progress);
            View findViewById4222 = playerControlView.findViewById(C0628R.id.exo_progress_placeholder);
            if (timeBar != null) {
            }
            timeBar2 = playerControlView2.timeBar;
            if (timeBar2 != null) {
            }
            Resources resources222 = context.getResources();
            playerControlView2.resources = resources222;
            imageView3 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_play_pause);
            playerControlView2.playPauseButton = imageView3;
            if (imageView3 != null) {
            }
            imageView4 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_prev);
            playerControlView2.previousButton = imageView4;
            if (imageView4 != null) {
            }
            imageView5 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_next);
            playerControlView2.nextButton = imageView5;
            if (imageView5 != null) {
            }
            Typeface font222 = ResourcesCompat.getFont(context, C0628R.font.roboto_medium_numbers);
            imageView6 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_rew);
            TextView textView322 = (TextView) playerControlView2.findViewById(C0628R.id.exo_rew_with_amount);
            if (imageView6 != null) {
            }
            view = playerControlView2.rewindButton;
            if (view != null) {
            }
            imageView7 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_ffwd);
            TextView textView2222 = (TextView) playerControlView2.findViewById(C0628R.id.exo_ffwd_with_amount);
            if (imageView7 != null) {
            }
            view2 = playerControlView2.fastForwardButton;
            if (view2 != null) {
            }
            imageView8 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_repeat_toggle);
            playerControlView2.repeatToggleButton = imageView8;
            if (imageView8 != null) {
            }
            imageView9 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_shuffle);
            playerControlView2.shuffleButton = imageView9;
            if (imageView9 != null) {
            }
            playerControlView2.buttonAlphaEnabled = resources222.getInteger(C0628R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
            playerControlView2.buttonAlphaDisabled = resources222.getInteger(C0628R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
            imageView10 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_vr);
            playerControlView2.vrButton = imageView10;
            if (imageView10 != null) {
            }
            PlayerControlViewLayoutManager playerControlViewLayoutManager222 = new PlayerControlViewLayoutManager(playerControlView2);
            playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager222;
            playerControlViewLayoutManager222.setAnimationEnabled(z4);
            SettingsAdapter settingsAdapter222 = playerControlView2.new SettingsAdapter(new String[]{resources222.getString(C0628R.string.exo_controls_playback_speed), resources222.getString(C0628R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources222, C0628R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources222, C0628R.drawable.exo_styled_controls_audiotrack)});
            playerControlView2.settingsAdapter = settingsAdapter222;
            playerControlView2.settingsWindowMargin = resources222.getDimensionPixelSize(C0628R.dimen.exo_settings_offset);
            RecyclerView recyclerView222 = (RecyclerView) LayoutInflater.from(context).inflate(C0628R.layout.exo_styled_settings_list, (ViewGroup) null);
            playerControlView2.settingsView = recyclerView222;
            recyclerView222.setAdapter(settingsAdapter222);
            recyclerView222.setLayoutManager(new LinearLayoutManager(getContext()));
            PopupWindow popupWindow222 = new PopupWindow((View) recyclerView222, -2, -2, true);
            playerControlView2.settingsWindow = popupWindow222;
            popupWindow222.setOnDismissListener(playerControlView2.componentListener);
            playerControlView2.needToHideBars = true;
            playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
            playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources222, i21);
            playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources222, i20);
            playerControlView2.subtitleOnContentDescription = resources222.getString(C0628R.string.exo_controls_cc_enabled_description);
            playerControlView2.subtitleOffContentDescription = resources222.getString(C0628R.string.exo_controls_cc_disabled_description);
            playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
            playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
            playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources222.getStringArray(C0628R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
            playerControlView2.playButtonDrawable = Util.getDrawable(context, resources222, i2);
            playerControlView2.pauseButtonDrawable = Util.getDrawable(context, resources222, i5);
            playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, resources222, i10);
            playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, resources222, i11);
            playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, resources222, i12);
            playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, resources222, i13);
            playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, resources222, i18);
            playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, resources222, i17);
            playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, resources222, i22);
            playerControlView2.fullscreenExitContentDescription = resources222.getString(C0628R.string.exo_controls_fullscreen_exit_description);
            playerControlView2.fullscreenEnterContentDescription = resources222.getString(C0628R.string.exo_controls_fullscreen_enter_description);
            playerControlView2.repeatOffButtonContentDescription = resources222.getString(C0628R.string.exo_controls_repeat_off_description);
            playerControlView2.repeatOneButtonContentDescription = resources222.getString(C0628R.string.exo_controls_repeat_one_description);
            playerControlView2.repeatAllButtonContentDescription = resources222.getString(C0628R.string.exo_controls_repeat_all_description);
            playerControlView2.shuffleOnContentDescription = resources222.getString(C0628R.string.exo_controls_shuffle_on_description);
            playerControlView2.shuffleOffContentDescription = resources222.getString(C0628R.string.exo_controls_shuffle_off_description);
            playerControlViewLayoutManager222.setShowButton((ViewGroup) playerControlView2.findViewById(C0628R.id.exo_bottom_bar), true);
            playerControlViewLayoutManager222.setShowButton(playerControlView2.fastForwardButton, z6);
            playerControlViewLayoutManager222.setShowButton(playerControlView2.rewindButton, z5);
            playerControlViewLayoutManager222.setShowButton(imageView4, z7);
            playerControlViewLayoutManager222.setShowButton(imageView5, z12);
            playerControlViewLayoutManager222.setShowButton(imageView9, z11);
            playerControlViewLayoutManager222.setShowButton(imageView2, z10);
            playerControlViewLayoutManager222.setShowButton(imageView10, z9);
            playerControlViewLayoutManager222.setShowButton(imageView8, playerControlView2.repeatToggleModes != 0);
            playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49) {
                    PlayerControlView.this.onLayoutChange(view3, i42, i43, i44, i45, i46, i47, i48, i49);
                }
            });
        }
        playerControlView.compositionPlayerClazz = cls2;
        playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method3;
        playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method4;
        playerControlView.durationView = (TextView) playerControlView.findViewById(C0628R.id.exo_duration);
        playerControlView.positionView = (TextView) playerControlView.findViewById(C0628R.id.exo_position);
        imageView = (ImageView) playerControlView.findViewById(C0628R.id.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(playerControlView.componentListener);
        }
        ImageView imageView112222 = (ImageView) playerControlView.findViewById(C0628R.id.exo_fullscreen);
        playerControlView.fullscreenButton = imageView112222;
        initializeFullscreenButton(imageView112222, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PlayerControlView.this.onFullscreenButtonClicked(view3);
            }
        });
        ImageView imageView122222 = (ImageView) playerControlView.findViewById(C0628R.id.exo_minimal_fullscreen);
        playerControlView.minimalFullscreenButton = imageView122222;
        initializeFullscreenButton(imageView122222, new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PlayerControlView.this.onFullscreenButtonClicked(view3);
            }
        });
        findViewById = playerControlView.findViewById(C0628R.id.exo_settings);
        playerControlView.settingsButton = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(playerControlView.componentListener);
        }
        findViewById2 = playerControlView.findViewById(C0628R.id.exo_playback_speed);
        playerControlView.playbackSpeedButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(playerControlView.componentListener);
        }
        findViewById3 = playerControlView.findViewById(C0628R.id.exo_audio_track);
        playerControlView.audioTrackButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(playerControlView.componentListener);
        }
        timeBar = (TimeBar) playerControlView.findViewById(C0628R.id.exo_progress);
        View findViewById42222 = playerControlView.findViewById(C0628R.id.exo_progress_placeholder);
        if (timeBar != null) {
            playerControlView.timeBar = timeBar;
            i20 = i15;
            i21 = i3;
            imageView2 = imageView;
            z9 = z3;
            i22 = i41;
            z10 = z2;
            playerControlView2 = playerControlView;
            int i42 = i19;
            z11 = z;
            i23 = i42;
        } else if (findViewById42222 != null) {
            i20 = i15;
            i21 = i3;
            z9 = z3;
            i22 = i41;
            z10 = z2;
            playerControlView2 = playerControlView;
            imageView2 = imageView;
            int i43 = i19;
            z11 = z;
            i23 = i43;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, C0628R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(C0628R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById42222.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById42222.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById42222);
            viewGroup.removeView(findViewById42222);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            playerControlView2.timeBar = defaultTimeBar;
        } else {
            i20 = i15;
            i21 = i3;
            imageView2 = imageView;
            z9 = z3;
            i22 = i41;
            z10 = z2;
            playerControlView2 = playerControlView;
            int i44 = i19;
            z11 = z;
            i23 = i44;
            playerControlView2.timeBar = null;
        }
        timeBar2 = playerControlView2.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(playerControlView2.componentListener);
        }
        Resources resources2222 = context.getResources();
        playerControlView2.resources = resources2222;
        imageView3 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_play_pause);
        playerControlView2.playPauseButton = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(playerControlView2.componentListener);
        }
        imageView4 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_prev);
        playerControlView2.previousButton = imageView4;
        if (imageView4 != null) {
            imageView4.setImageDrawable(Util.getDrawable(context, resources2222, i8));
            imageView4.setOnClickListener(playerControlView2.componentListener);
        }
        imageView5 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_next);
        playerControlView2.nextButton = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(Util.getDrawable(context, resources2222, i6));
            imageView5.setOnClickListener(playerControlView2.componentListener);
        }
        Typeface font2222 = ResourcesCompat.getFont(context, C0628R.font.roboto_medium_numbers);
        imageView6 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_rew);
        TextView textView3222 = (TextView) playerControlView2.findViewById(C0628R.id.exo_rew_with_amount);
        if (imageView6 != null) {
            z12 = z8;
            imageView6.setImageDrawable(Util.getDrawable(context, resources2222, i9));
            playerControlView2.rewindButton = imageView6;
            playerControlView2.rewindButtonTextView = null;
        } else {
            z12 = z8;
            if (textView3222 != null) {
                textView3222.setTypeface(font2222);
                playerControlView2.rewindButtonTextView = textView3222;
                playerControlView2.rewindButton = textView3222;
            } else {
                playerControlView2.rewindButtonTextView = null;
                playerControlView2.rewindButton = null;
            }
        }
        view = playerControlView2.rewindButton;
        if (view != null) {
            view.setOnClickListener(playerControlView2.componentListener);
        }
        imageView7 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_ffwd);
        TextView textView22222 = (TextView) playerControlView2.findViewById(C0628R.id.exo_ffwd_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(Util.getDrawable(context, resources2222, i7));
            playerControlView2.fastForwardButton = imageView7;
            playerControlView2.fastForwardButtonTextView = null;
        } else if (textView22222 != null) {
            textView22222.setTypeface(font2222);
            playerControlView2.fastForwardButtonTextView = textView22222;
            playerControlView2.fastForwardButton = textView22222;
        } else {
            playerControlView2.fastForwardButtonTextView = null;
            playerControlView2.fastForwardButton = null;
        }
        view2 = playerControlView2.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(playerControlView2.componentListener);
        }
        imageView8 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView8;
        if (imageView8 != null) {
            imageView8.setOnClickListener(playerControlView2.componentListener);
        }
        imageView9 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_shuffle);
        playerControlView2.shuffleButton = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(playerControlView2.componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources2222.getInteger(C0628R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources2222.getInteger(C0628R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView10 = (ImageView) playerControlView2.findViewById(C0628R.id.exo_vr);
        playerControlView2.vrButton = imageView10;
        if (imageView10 != null) {
            imageView10.setImageDrawable(Util.getDrawable(context, resources2222, i23));
            playerControlView2.updateButton(false, imageView10);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager2222 = new PlayerControlViewLayoutManager(playerControlView2);
        playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager2222;
        playerControlViewLayoutManager2222.setAnimationEnabled(z4);
        SettingsAdapter settingsAdapter2222 = playerControlView2.new SettingsAdapter(new String[]{resources2222.getString(C0628R.string.exo_controls_playback_speed), resources2222.getString(C0628R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context, resources2222, C0628R.drawable.exo_styled_controls_speed), Util.getDrawable(context, resources2222, C0628R.drawable.exo_styled_controls_audiotrack)});
        playerControlView2.settingsAdapter = settingsAdapter2222;
        playerControlView2.settingsWindowMargin = resources2222.getDimensionPixelSize(C0628R.dimen.exo_settings_offset);
        RecyclerView recyclerView2222 = (RecyclerView) LayoutInflater.from(context).inflate(C0628R.layout.exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.settingsView = recyclerView2222;
        recyclerView2222.setAdapter(settingsAdapter2222);
        recyclerView2222.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow2222 = new PopupWindow((View) recyclerView2222, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow2222;
        popupWindow2222.setOnDismissListener(playerControlView2.componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new DefaultTrackNameProvider(getResources());
        playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context, resources2222, i21);
        playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context, resources2222, i20);
        playerControlView2.subtitleOnContentDescription = resources2222.getString(C0628R.string.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = resources2222.getString(C0628R.string.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
        playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
        playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources2222.getStringArray(C0628R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = Util.getDrawable(context, resources2222, i2);
        playerControlView2.pauseButtonDrawable = Util.getDrawable(context, resources2222, i5);
        playerControlView2.fullscreenExitDrawable = Util.getDrawable(context, resources2222, i10);
        playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context, resources2222, i11);
        playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context, resources2222, i12);
        playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context, resources2222, i13);
        playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context, resources2222, i18);
        playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context, resources2222, i17);
        playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context, resources2222, i22);
        playerControlView2.fullscreenExitContentDescription = resources2222.getString(C0628R.string.exo_controls_fullscreen_exit_description);
        playerControlView2.fullscreenEnterContentDescription = resources2222.getString(C0628R.string.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = resources2222.getString(C0628R.string.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = resources2222.getString(C0628R.string.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = resources2222.getString(C0628R.string.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = resources2222.getString(C0628R.string.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = resources2222.getString(C0628R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager2222.setShowButton((ViewGroup) playerControlView2.findViewById(C0628R.id.exo_bottom_bar), true);
        playerControlViewLayoutManager2222.setShowButton(playerControlView2.fastForwardButton, z6);
        playerControlViewLayoutManager2222.setShowButton(playerControlView2.rewindButton, z5);
        playerControlViewLayoutManager2222.setShowButton(imageView4, z7);
        playerControlViewLayoutManager2222.setShowButton(imageView5, z12);
        playerControlViewLayoutManager2222.setShowButton(imageView9, z11);
        playerControlViewLayoutManager2222.setShowButton(imageView2, z10);
        playerControlViewLayoutManager2222.setShowButton(imageView10, z9);
        playerControlViewLayoutManager2222.setShowButton(imageView8, playerControlView2.repeatToggleModes != 0);
        playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i422, int i432, int i442, int i45, int i46, int i47, int i48, int i49) {
                PlayerControlView.this.onLayoutChange(view3, i422, i432, i442, i45, i46, i47, i48, i49);
            }
        });
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    @Deprecated
    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z);
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z);
        updateNavigation();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z);
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        Player player = this.player;
        if (player != null && player.isCommandAvailable(15)) {
            int repeatMode = this.player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i != 0);
        updateRepeatModeButton();
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z);
        updateShuffleButton();
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z);
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.setAnimationEnabled(z);
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.timeBarScrubbingEnabled = z;
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i, 16, 1000);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullscreenButtonVisibility(this.fullscreenButton, onFullScreenModeChangedListener != null);
        updateFullscreenButtonVisibility(this.minimalFullscreenButton, onFullScreenModeChangedListener != null);
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    void notifyOnVisibilityChange() {
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        int i;
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean shouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            Drawable drawable = shouldShowPlayButton ? this.playButtonDrawable : this.pauseButtonDrawable;
            if (shouldShowPlayButton) {
                i = C0628R.string.exo_controls_play_description;
            } else {
                i = C0628R.string.exo_controls_pause_description;
            }
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i));
            updateButton(Util.shouldEnablePlayPauseButton(this.player), this.playPauseButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                if (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window)) {
                    z = player.isCommandAvailable(10);
                } else {
                    z = player.isCommandAvailable(5);
                }
                z3 = player.isCommandAvailable(7);
                z4 = player.isCommandAvailable(11);
                z5 = player.isCommandAvailable(12);
                z2 = player.isCommandAvailable(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (z4) {
                updateRewindButton();
            }
            if (z5) {
                updateFastForwardButton();
            }
            updateButton(z3, this.previousButton);
            updateButton(z4, this.rewindButton);
            updateButton(z5, this.fastForwardButton);
            updateButton(z2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z);
            }
        }
    }

    private void updateRewindButton() {
        Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(C0628R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateFastForwardButton() {
        Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : C0366C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(C0628R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null || !player.isCommandAvailable(15)) {
                updateButton(false, this.repeatToggleButton);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, this.repeatToggleButton);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player == null || !player.isCommandAvailable(14)) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
                return;
            }
            updateButton(true, this.shuffleButton);
            this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
            ImageView imageView2 = this.shuffleButton;
            if (player.getShuffleModeEnabled()) {
                str = this.shuffleOnContentDescription;
            } else {
                str = this.shuffleOffContentDescription;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
        updateSettingsButton();
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                this.textTrackSelectionAdapter.init(ImmutableList.m393of());
            }
        }
    }

    private ImmutableList<TrackInformation> gatherSupportedTrackInfosOfType(Tracks tracks, int i) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                for (int i3 = 0; i3 < group.length; i3++) {
                    if (group.isTrackSupported(i3)) {
                        Format trackFormat = group.getTrackFormat(i3);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            builder.add((ImmutableList.Builder) new TrackInformation(tracks, i2, i3, this.trackNameProvider.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeline() {
        Timeline timeline;
        long j;
        int i;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window);
        this.currentWindowOffset = 0L;
        if (player.isCommandAvailable(17)) {
            timeline = player.getCurrentTimeline();
        } else {
            timeline = Timeline.EMPTY;
        }
        if (!timeline.isEmpty()) {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int windowCount = z2 ? timeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j2 = 0;
            i = 0;
            while (true) {
                if (i2 > windowCount) {
                    break;
                }
                if (i2 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j2);
                }
                timeline.getWindow(i2, this.window);
                if (this.window.durationUs == C0366C.TIME_UNSET) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z);
                    break;
                }
                for (int i3 = this.window.firstPeriodIndex; i3 <= this.window.lastPeriodIndex; i3++) {
                    timeline.getPeriod(i3, this.period);
                    int adGroupCount = this.period.getAdGroupCount();
                    for (int removedAdGroupCount = this.period.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                        long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                        if (adGroupTimeUs == Long.MIN_VALUE) {
                            if (this.period.durationUs != C0366C.TIME_UNSET) {
                                adGroupTimeUs = this.period.durationUs;
                            }
                        }
                        long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                        if (positionInWindowUs >= 0) {
                            long[] jArr = this.adGroupTimesMs;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                            }
                            this.adGroupTimesMs[i] = Util.usToMs(j2 + positionInWindowUs);
                            this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                            i++;
                        }
                    }
                }
                j2 += this.window.durationUs;
                i2++;
                z = true;
            }
            j = j2;
        } else {
            if (player.isCommandAvailable(16)) {
                long contentDuration = player.getContentDuration();
                if (contentDuration != C0366C.TIME_UNSET) {
                    j = Util.msToUs(contentDuration);
                    i = 0;
                }
            }
            j = 0;
            i = 0;
        }
        long usToMs = Util.usToMs(j);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, usToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(usToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i4 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i4 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i4);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i4);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i4);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long j;
        long j2;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player == null || !player.isCommandAvailable(16)) {
                j = 0;
                j2 = 0;
            } else {
                j = this.currentWindowOffset + player.getContentPosition();
                j2 = this.currentWindowOffset + player.getContentBufferedPosition();
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(j);
                this.timeBar.setBufferedPosition(isScrubbingModeEnabled(player) ? j : j2);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(j, j2);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long min = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f > 0.0f ? (long) (min / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
        updateSettingsButton();
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.hasSettingsToShow(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.Adapter<?> adapter, View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        Player player = this.player;
        if (player == null || !player.isCommandAvailable(13)) {
            return;
        }
        Player player2 = this.player;
        player2.setPlaybackParameters(player2.getPlaybackParameters().withSpeed(f));
    }

    void requestPlayPauseFocus() {
        ImageView imageView = this.playPauseButton;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    private void updateButton(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j) {
        if (this.multiWindowTimeBar) {
            if (player.isCommandAvailable(17) && player.isCommandAvailable(10)) {
                Timeline currentTimeline = player.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i = 0;
                while (true) {
                    long durationMs = currentTimeline.getWindow(i, this.window).getDurationMs();
                    if (j < durationMs) {
                        break;
                    }
                    if (i == windowCount - 1) {
                        j = durationMs;
                        break;
                    } else {
                        j -= durationMs;
                        i++;
                    }
                }
                player.seekTo(i, j);
            }
        } else if (player.isCommandAvailable(5)) {
            player.seekTo(j);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullscreenButtonClicked(View view) {
        updateIsFullscreen(!this.isFullscreen);
    }

    public void updateIsFullscreen(boolean z) {
        if (this.isFullscreen == z) {
            return;
        }
        this.isFullscreen = z;
        updateFullscreenButtonForState(this.fullscreenButton, z);
        updateFullscreenButtonForState(this.minimalFullscreenButton, z);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(z);
        }
    }

    private void updateFullscreenButtonForState(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.fullscreenExitDrawable);
            imageView.setContentDescription(this.fullscreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullscreenEnterDrawable);
            imageView.setContentDescription(this.fullscreenEnterContentDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i) {
        if (i == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else if (i == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else {
            this.settingsWindow.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89 && player.isCommandAvailable(11)) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            if (!player.isCommandAvailable(9)) {
                return true;
            }
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!player.isCommandAvailable(7)) {
                return true;
            }
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.handlePauseButtonAction(player);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.controlViewLayoutManager.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    private static boolean canShowMultiWindowTimeBar(Player player, Timeline.Window window) {
        Timeline currentTimeline;
        int windowCount;
        if (!player.isCommandAvailable(17) || (windowCount = (currentTimeline = player.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i = 0; i < windowCount; i++) {
            if (currentTimeline.getWindow(i, window).durationUs == C0366C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private static void initializeFullscreenButton(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static void updateFullscreenButtonVisibility(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(C0628R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isScrubbingModeEnabled(Player player) {
        try {
            if (!isExoPlayer(player) || !((Boolean) Assertions.checkNotNull(((Method) Assertions.checkNotNull(this.isScrubbingModeEnabledMethod)).invoke(player, new Object[0]))).booleanValue()) {
                if (!isCompositionPlayer(player)) {
                    return false;
                }
                if (!((Boolean) Assertions.checkNotNull(((Method) Assertions.checkNotNull(this.compositionPlayerIsScrubbingModeEnabledMethod)).invoke(player, new Object[0]))).booleanValue()) {
                    return false;
                }
            }
            return true;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isExoPlayer(Player player) {
        Class<?> cls;
        return (player == null || (cls = this.exoplayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isCompositionPlayer(Player player) {
        Class<?> cls;
        return (player == null || (cls = this.compositionPlayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    private final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 13)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                PlayerControlView.this.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                PlayerControlView.this.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                PlayerControlView.this.updateTrackLists();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
            PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
            PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
            if (PlayerControlView.this.player == null || !PlayerControlView.this.timeBarScrubbingEnabled) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.isExoPlayer(playerControlView.player)) {
                try {
                    ((Method) Assertions.checkNotNull(PlayerControlView.this.setScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, true);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
            PlayerControlView playerControlView2 = PlayerControlView.this;
            if (playerControlView2.isCompositionPlayer(playerControlView2.player)) {
                try {
                    ((Method) Assertions.checkNotNull(PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, true);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
            Log.m61w(PlayerControlView.TAG, "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=" + ((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getClass());
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.isScrubbingModeEnabled(playerControlView.player)) {
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.seekToTimeBarPosition(playerControlView2.player, j);
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            PlayerControlView.this.scrubbing = false;
            if (PlayerControlView.this.player != null) {
                if (!z) {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    playerControlView.seekToTimeBarPosition(playerControlView.player, j);
                }
                PlayerControlView playerControlView2 = PlayerControlView.this;
                if (playerControlView2.isExoPlayer(playerControlView2.player)) {
                    try {
                        ((Method) Assertions.checkNotNull(PlayerControlView.this.setScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, false);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    PlayerControlView playerControlView3 = PlayerControlView.this;
                    if (playerControlView3.isCompositionPlayer(playerControlView3.player)) {
                        try {
                            ((Method) Assertions.checkNotNull(PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod)).invoke(PlayerControlView.this.player, false);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.needToHideBars) {
                PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (PlayerControlView.this.nextButton != view) {
                if (PlayerControlView.this.previousButton != view) {
                    if (PlayerControlView.this.fastForwardButton != view) {
                        if (PlayerControlView.this.rewindButton != view) {
                            if (PlayerControlView.this.playPauseButton == view) {
                                Util.handlePlayPauseButtonAction(player, PlayerControlView.this.showPlayButtonIfSuppressed);
                                return;
                            }
                            if (PlayerControlView.this.repeatToggleButton != view) {
                                if (PlayerControlView.this.shuffleButton != view) {
                                    if (PlayerControlView.this.settingsButton == view) {
                                        PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        PlayerControlView playerControlView = PlayerControlView.this;
                                        playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, PlayerControlView.this.settingsButton);
                                        return;
                                    }
                                    if (PlayerControlView.this.playbackSpeedButton == view) {
                                        PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        PlayerControlView playerControlView2 = PlayerControlView.this;
                                        playerControlView2.displaySettingsWindow(playerControlView2.playbackSpeedAdapter, PlayerControlView.this.playbackSpeedButton);
                                        return;
                                    } else if (PlayerControlView.this.audioTrackButton == view) {
                                        PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        PlayerControlView playerControlView3 = PlayerControlView.this;
                                        playerControlView3.displaySettingsWindow(playerControlView3.audioTrackSelectionAdapter, PlayerControlView.this.audioTrackButton);
                                        return;
                                    } else {
                                        if (PlayerControlView.this.subtitleButton == view) {
                                            PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                            PlayerControlView playerControlView4 = PlayerControlView.this;
                                            playerControlView4.displaySettingsWindow(playerControlView4.textTrackSelectionAdapter, PlayerControlView.this.subtitleButton);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (player.isCommandAvailable(14)) {
                                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                                    return;
                                }
                                return;
                            }
                            if (player.isCommandAvailable(15)) {
                                player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                                return;
                            }
                            return;
                        }
                        if (player.isCommandAvailable(11)) {
                            player.seekBack();
                            return;
                        }
                        return;
                    }
                    if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                        return;
                    }
                    player.seekForward();
                    return;
                }
                if (player.isCommandAvailable(7)) {
                    player.seekToPrevious();
                    return;
                }
                return;
            }
            if (player.isCommandAvailable(9)) {
                player.seekToNext();
            }
        }
    }

    private class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return PlayerControlView.this.new SettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C0628R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i) {
            if (shouldShowSetting(i)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.mainTexts[i]);
            if (this.subTexts[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i]);
            }
            if (this.iconIds[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mainTexts.length;
        }

        public void setSubTextAtPosition(int i, String str) {
            this.subTexts[i] = str;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        private boolean shouldShowSetting(int i) {
            if (PlayerControlView.this.player == null) {
                return false;
            }
            if (i == 0) {
                return PlayerControlView.this.player.isCommandAvailable(13);
            }
            if (i != 1) {
                return true;
            }
            return PlayerControlView.this.player.isCommandAvailable(30) && PlayerControlView.this.player.isCommandAvailable(29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SettingViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(C0628R.id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(C0628R.id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(C0628R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlayerControlView.SettingViewHolder.this.m214x7eeeb754(view2);
                }
            });
        }

        /* renamed from: lambda$new$0$androidx-media3-ui-PlayerControlView$SettingViewHolder */
        /* synthetic */ void m214x7eeeb754(View view) {
            PlayerControlView.this.onSettingViewClicked(getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        public void updateSelectedIndex(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i < fArr.length) {
                    float abs = Math.abs(f - fArr[i]);
                    if (abs < f2) {
                        i2 = i;
                        f2 = abs;
                    }
                    i++;
                } else {
                    this.selectedIndex = i2;
                    return;
                }
            }
        }

        public String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C0628R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, final int i) {
            if (i < this.playbackSpeedTexts.length) {
                subSettingViewHolder.textView.setText(this.playbackSpeedTexts[i]);
            }
            if (i == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$PlaybackSpeedAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.PlaybackSpeedAdapter.this.m213x9de2ddb7(i, view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolder$0$androidx-media3-ui-PlayerControlView$PlaybackSpeedAdapter */
        /* synthetic */ void m213x9de2ddb7(int i, View view) {
            if (i != this.selectedIndex) {
                PlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i]);
            }
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(Tracks tracks, int i, int i2, String str) {
            this.trackGroup = tracks.getGroups().get(i);
            this.trackIndex = i2;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }

        private TextTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (list.get(i).isSelected()) {
                    z = true;
                    break;
                }
                i++;
            }
            if (PlayerControlView.this.subtitleButton != null) {
                ImageView imageView = PlayerControlView.this.subtitleButton;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                PlayerControlView.this.subtitleButton.setContentDescription(z ? PlayerControlView.this.subtitleOnContentDescription : PlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(C0628R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.tracks.size()) {
                    z = true;
                    break;
                } else {
                    if (this.tracks.get(i).isSelected()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$TextTrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.TextTrackSelectionAdapter.this.m215x7bd5d809(view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolderAtZeroPosition$0$androidx-media3-ui-PlayerControlView$TextTrackSelectionAdapter */
        /* synthetic */ void m215x7bd5d809(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            PlayerControlView.this.player.setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).setPreferredTextLanguage(null).setPreferredTextRoleFlags(0).build());
            PlayerControlView.this.settingsWindow.dismiss();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i + (-1)).isSelected() ? 0 : 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(C0628R.string.exo_track_selection_auto);
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$AudioTrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.AudioTrackSelectionAdapter.this.m212xa84b12b0(view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolderAtZeroPosition$0$androidx-media3-ui-PlayerControlView$AudioTrackSelectionAdapter */
        /* synthetic */ void m212xa84b12b0(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            ((Player) Util.castNonNull(PlayerControlView.this.player)).setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(C0628R.string.exo_track_selection_auto));
            PlayerControlView.this.settingsWindow.dismiss();
        }

        private boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.tracks.size(); i++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            this.tracks = list;
            TrackSelectionParameters trackSelectionParameters = ((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(C0628R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(C0628R.string.exo_track_selection_auto));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                TrackInformation trackInformation = list.get(i);
                if (trackInformation.isSelected()) {
                    PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        protected List<TrackInformation> tracks = new ArrayList();

        public abstract void init(List<TrackInformation> list);

        protected abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        protected abstract void onTrackSelection(String str);

        protected TrackSelectionAdapter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C0628R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i) {
            final Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final TrackInformation trackInformation = this.tracks.get(i - 1);
            final TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$TrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.TrackSelectionAdapter.this.m216x45c3fb1a(player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolder$0$androidx-media3-ui-PlayerControlView$TrackSelectionAdapter */
        /* synthetic */ void m216x45c3fb1a(Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
            if (player.isCommandAvailable(29)) {
                player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroup, ImmutableList.m394of(Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
                onTrackSelection(trackInformation.trackName);
                PlayerControlView.this.settingsWindow.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        protected void clear() {
            this.tracks = Collections.emptyList();
        }
    }

    private static class SubSettingViewHolder extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(C0628R.id.exo_text);
            this.checkView = view.findViewById(C0628R.id.exo_check);
        }
    }
}
