package je;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import ie.C3574f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class C1 {

    @NotNull
    public static final B1 Companion = new B1();
    public static final Sk.l[] D = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, Sk.m.a(Sk.n.b, new C3574f(28)), null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public final String A;
    public final String B;
    public final String C;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final boolean l;
    public final String m;
    public final String n;
    public final List o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public C1(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, String str9, boolean z, String str10, String str11, List list, String str12, String str13, String str14, String str15, String str16, String str17, boolean z2, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        if ((i & 1) == 0) {
            this.a = BuildConfig.FLAVOR;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = BuildConfig.FLAVOR;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = BuildConfig.FLAVOR;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = BuildConfig.FLAVOR;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = BuildConfig.FLAVOR;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = BuildConfig.FLAVOR;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = BuildConfig.FLAVOR;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = BuildConfig.FLAVOR;
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i2;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i3;
        }
        if ((i & 1024) == 0) {
            this.k = BuildConfig.FLAVOR;
        } else {
            this.k = str9;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z;
        }
        if ((i & 4096) == 0) {
            this.m = BuildConfig.FLAVOR;
        } else {
            this.m = str10;
        }
        if ((i & 8192) == 0) {
            this.n = BuildConfig.FLAVOR;
        } else {
            this.n = str11;
        }
        this.o = (i & 16384) == 0 ? kotlin.collections.I.a : list;
        if ((32768 & i) == 0) {
            this.p = BuildConfig.FLAVOR;
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = BuildConfig.FLAVOR;
        } else {
            this.q = str13;
        }
        if ((131072 & i) == 0) {
            this.r = BuildConfig.FLAVOR;
        } else {
            this.r = str14;
        }
        if ((262144 & i) == 0) {
            this.s = BuildConfig.FLAVOR;
        } else {
            this.s = str15;
        }
        if ((524288 & i) == 0) {
            this.t = BuildConfig.FLAVOR;
        } else {
            this.t = str16;
        }
        if ((1048576 & i) == 0) {
            this.u = BuildConfig.FLAVOR;
        } else {
            this.u = str17;
        }
        if ((2097152 & i) == 0) {
            this.v = false;
        } else {
            this.v = z2;
        }
        if ((4194304 & i) == 0) {
            this.w = BuildConfig.FLAVOR;
        } else {
            this.w = str18;
        }
        if ((8388608 & i) == 0) {
            this.x = BuildConfig.FLAVOR;
        } else {
            this.x = str19;
        }
        if ((16777216 & i) == 0) {
            this.y = BuildConfig.FLAVOR;
        } else {
            this.y = str20;
        }
        if ((33554432 & i) == 0) {
            this.z = BuildConfig.FLAVOR;
        } else {
            this.z = str21;
        }
        if ((67108864 & i) == 0) {
            this.A = BuildConfig.FLAVOR;
        } else {
            this.A = str22;
        }
        if ((134217728 & i) == 0) {
            this.B = BuildConfig.FLAVOR;
        } else {
            this.B = str23;
        }
        if ((i & 268435456) == 0) {
            this.C = BuildConfig.FLAVOR;
        } else {
            this.C = str24;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c1 = (C1) obj;
        return Intrinsics.b(this.a, c1.a) && Intrinsics.b(this.b, c1.b) && Intrinsics.b(this.c, c1.c) && Intrinsics.b(this.d, c1.d) && Intrinsics.b(this.e, c1.e) && Intrinsics.b(this.f, c1.f) && Intrinsics.b(this.g, c1.g) && Intrinsics.b(this.h, c1.h) && this.i == c1.i && this.j == c1.j && Intrinsics.b(this.k, c1.k) && this.l == c1.l && Intrinsics.b(this.m, c1.m) && Intrinsics.b(this.n, c1.n) && Intrinsics.b(this.o, c1.o) && Intrinsics.b(this.p, c1.p) && Intrinsics.b(this.q, c1.q) && Intrinsics.b(this.r, c1.r) && Intrinsics.b(this.s, c1.s) && Intrinsics.b(this.t, c1.t) && Intrinsics.b(this.u, c1.u) && this.v == c1.v && Intrinsics.b(this.w, c1.w) && Intrinsics.b(this.x, c1.x) && Intrinsics.b(this.y, c1.y) && Intrinsics.b(this.z, c1.z) && Intrinsics.b(this.A, c1.A) && Intrinsics.b(this.B, c1.B) && Intrinsics.b(this.C, c1.C);
    }

    public final int hashCode() {
        return this.C.hashCode() + Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(cn.jiguang.commons.a.A.i(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(A8.b.a(Ie.K0.d(Ie.K0.d(cn.jiguang.commons.a.A.i(Ie.K0.d(cn.jiguang.commons.a.A.A(this.j, cn.jiguang.commons.a.A.A(this.i, Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(Ie.K0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31, this.k), this.l, 31), 31, this.m), 31, this.n), this.o, 31), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), this.v, 31), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B);
    }

    public final String toString() {
        StringBuilder sbL = A8.b.l("ToolArgs(index=", this.a, ", url=", this.b, ", elementIndex=");
        A8.b.x(sbL, this.c, ", findKeyword=", this.d, ", content=");
        A8.b.x(sbL, this.e, ", scrollAmount=", this.f, ", description=");
        A8.b.x(sbL, this.g, ", code=", this.h, ", width=");
        s3.e.w(sbL, this.i, ", height=", this.j, ", filePath=");
        S0.b.w(this.k, ", append=", ", command=", sbL, this.l);
        A8.b.x(sbL, this.m, ", keyword=", this.n, ", queries=");
        sbL.append(this.o);
        sbL.append(", dataSourceName=");
        sbL.append(this.p);
        sbL.append(", name=");
        A8.b.x(sbL, this.q, ", systemPrompt=", this.r, ", prompt=");
        A8.b.x(sbL, this.s, ", agent=", this.t, ", agentType=");
        S0.b.w(this.u, ", runInBackground=", ", workDir=", sbL, this.v);
        A8.b.x(sbL, this.w, ", oldString=", this.x, ", newString=");
        A8.b.x(sbL, this.y, ", inputUrl=", this.z, ", slideTitle=");
        A8.b.x(sbL, this.A, ", apiName=", this.B, ", action=");
        return A8.b.j(sbL, this.C, ")");
    }

    public C1() {
        kotlin.collections.I i = kotlin.collections.I.a;
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, FirebaseAnalytics.Param.INDEX);
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "url");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "elementIndex");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "findKeyword");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, FirebaseAnalytics.Param.CONTENT);
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "scrollAmount");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "description");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "code");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "filePath");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "command");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "keyword");
        Intrinsics.checkNotNullParameter(i, "queries");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "dataSourceName");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "name");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "systemPrompt");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "prompt");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "agent");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "agentType");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "workDir");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "oldString");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "newString");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "inputUrl");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "slideTitle");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "apiName");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "action");
        this.a = BuildConfig.FLAVOR;
        this.b = BuildConfig.FLAVOR;
        this.c = BuildConfig.FLAVOR;
        this.d = BuildConfig.FLAVOR;
        this.e = BuildConfig.FLAVOR;
        this.f = BuildConfig.FLAVOR;
        this.g = BuildConfig.FLAVOR;
        this.h = BuildConfig.FLAVOR;
        this.i = 0;
        this.j = 0;
        this.k = BuildConfig.FLAVOR;
        this.l = false;
        this.m = BuildConfig.FLAVOR;
        this.n = BuildConfig.FLAVOR;
        this.o = i;
        this.p = BuildConfig.FLAVOR;
        this.q = BuildConfig.FLAVOR;
        this.r = BuildConfig.FLAVOR;
        this.s = BuildConfig.FLAVOR;
        this.t = BuildConfig.FLAVOR;
        this.u = BuildConfig.FLAVOR;
        this.v = false;
        this.w = BuildConfig.FLAVOR;
        this.x = BuildConfig.FLAVOR;
        this.y = BuildConfig.FLAVOR;
        this.z = BuildConfig.FLAVOR;
        this.A = BuildConfig.FLAVOR;
        this.B = BuildConfig.FLAVOR;
        this.C = BuildConfig.FLAVOR;
    }
}
