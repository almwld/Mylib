package G2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import g3.InterpolatorC1243a;
import java.util.List;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2569e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterpolatorC1243a f2570f = new InterpolatorC1243a(InterpolatorC1243a.f19527c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2571g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f2572h = new AccelerateInterpolator(1.5f);

    public static void f(View view, c0 c0Var) {
        V vK = k(view);
        if (vK != null) {
            vK.e(c0Var);
            if (vK.f2560a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), c0Var);
            }
        }
    }

    public static void g(View view, c0 c0Var, u0 u0Var, boolean z10) {
        V vK = k(view);
        if (vK != null) {
            vK.f2561b = u0Var;
            if (!z10) {
                vK.f();
                z10 = vK.f2560a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                g(viewGroup.getChildAt(i4), c0Var, u0Var, z10);
            }
        }
    }

    public static void h(View view, u0 u0Var, List list) {
        V vK = k(view);
        if (vK != null) {
            u0Var = vK.g(u0Var, list);
            if (vK.f2560a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), u0Var, list);
            }
        }
    }

    public static void i(View view, c0 c0Var, N0.H h9) {
        V vK = k(view);
        if (vK != null) {
            vK.h(c0Var, h9);
            if (vK.f2560a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                i(viewGroup.getChildAt(i4), c0Var, h9);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(2131296535) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static V k(View view) {
        Object tag = view.getTag(2131296544);
        if (tag instanceof X) {
            return ((X) tag).f2567a;
        }
        return null;
    }
}
