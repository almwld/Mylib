package Zd;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import ub.U4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class D {
    public static final D c;
    public static final D d;
    public static final D e;
    public static final D f;
    public static final D g;
    public static final D h;
    public static final D i;
    public static final D j;
    public static final D k;
    public static final D l;
    public static final D m;
    public static final D n;
    public static final D o;
    public static final D p;
    public static final D q;
    public static final D r;
    public static final D s;
    public static final D t;
    public static final D u;
    public static final D v;
    public static final D w;
    public static final D x;
    public static final /* synthetic */ D[] y;
    public final String a;
    public final Zn.f b;

    static {
        Qk.F f2 = Qk.F.a;
        Sk.w wVar = Qk.q.a;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d2 = new D("Think", 0, "drawable/anim_tool_think.webp", (Zn.f) Qk.q.u.getValue());
        c = d2;
        Sk.w wVar2 = Qk.d.a;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d3 = new D("Todo", 1, "drawable/anim_tool_todo.webp", (Zn.f) Qk.d.h.getValue());
        d = d3;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d4 = new D("Code", 2, "drawable/anim_tool_code.webp", (Zn.f) Qk.d.Q.getValue());
        e = d4;
        D d5 = new D("File", 3, "drawable/anim_tool_file.webp", Qk.i.a());
        f = d5;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d6 = new D("Browser", 4, "drawable/anim_tool_browser.webp", (Zn.f) Qk.d.v.getValue());
        g = d6;
        D d7 = new D("Search", 5, "drawable/anim_tool_search.webp", Qk.z.c());
        h = d7;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d8 = new D("Image", 6, "drawable/anim_tool_image.webp", (Zn.f) Qk.q.o.getValue());
        i = d8;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d9 = new D("Sound", 7, "drawable/anim_tool_sound.webp", (Zn.f) Qk.z.Q.getValue());
        j = d9;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d10 = new D("DataSource", 8, "drawable/anim_tool_data.webp", (Zn.f) Qk.d.f0.getValue());
        k = d10;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d11 = new D("Mcp", 9, "drawable/anim_tool_mcp.webp", (Zn.f) Qk.q.e0.getValue());
        l = d11;
        D d12 = new D("Plugin", 10, BuildConfig.FLAVOR, Qk.v.b());
        m = d12;
        D d13 = new D("PPT", 11, "drawable/anim_tool_ppt.webp", Qk.v.c());
        n = d13;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d14 = new D("Location", 12, "drawable/anim_tool_location.webp", (Zn.f) Qk.q.Y.getValue());
        o = d14;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d15 = new D("Memory", 13, "drawable/anim_tool_memory.webp", (Zn.f) Qk.q.f0.getValue());
        p = d15;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d16 = new D("Web", 14, "drawable/anim_tool_web.webp", (Zn.f) Qk.q.r.getValue());
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d17 = new D("CreateSubagent", 15, "drawable/anim_tool_create_subagent.webp", (Zn.f) Qk.d.X.getValue());
        q = d17;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d18 = new D("Task", 16, "drawable/anim_tool_task.webp", (Zn.f) Qk.z.e0.getValue());
        r = d18;
        D d19 = new D("CronJob", 17, BuildConfig.FLAVOR, Qk.d.g());
        s = d19;
        Sk.w wVar3 = Qk.m.a;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d20 = new D("FindAsset", 18, "drawable/anim_tool_find_asset.webp", (Zn.f) Qk.m.e.getValue());
        t = d20;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d21 = new D("AskUser", 19, "drawable/anim_tool_ask_user.webp", (Zn.f) Qk.z.X.getValue());
        u = d21;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d22 = new D("CheckSubAgent", 20, BuildConfig.FLAVOR, (Zn.f) Qk.z.x.getValue());
        v = d22;
        D d23 = new D("Goal", 21, BuildConfig.FLAVOR, Qk.m.b());
        w = d23;
        Intrinsics.checkNotNullParameter(f2, "<this>");
        D d24 = new D("SlidesOutline", 22, BuildConfig.FLAVOR, (Zn.f) Qk.d.C.getValue());
        x = d24;
        D[] dArr = {d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24};
        y = dArr;
        U4.o(dArr);
    }

    public D(String str, int i2, String str2, Zn.f fVar) {
        this.a = str2;
        this.b = fVar;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) y.clone();
    }
}
