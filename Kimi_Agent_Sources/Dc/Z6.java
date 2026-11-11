package Dc;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yc.C5673g;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class Z6 {

    @NotNull
    public static final J6 Companion = new J6();
    public static final Sk.l[] s;
    public static final Z6 t;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final zc.N1 e;
    public final R6 f;
    public final Y6 g;
    public final N7 h;
    public final C0683z7 i;
    public final G7 j;
    public final C0656w7 k;
    public final D7 l;
    public final K7 m;
    public final C5673g n;
    public final O6 o;
    public final int p;
    public final C0679z3 q;
    public final List r;

    static {
        Sk.n nVar = Sk.n.b;
        s = new Sk.l[]{null, null, null, null, Sk.m.a(nVar, new P5(8)), null, Sk.m.a(nVar, new P5(9)), null, null, null, null, null, null, null, Sk.m.a(nVar, new P5(10)), null, null, Sk.m.a(nVar, new P5(11))};
        t = new Z6();
    }

    public Z6(int i, String str, String str2, String str3, boolean z, zc.N1 n1, R6 r6, Y6 y6, N7 n7, C0683z7 c0683z7, G7 g7, C0656w7 c0656w7, D7 d7, K7 k7, C5673g c5673g, O6 o6, int i2, C0679z3 c0679z3, List list) {
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
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = zc.N1.Companion.M0(0);
        } else {
            this.e = n1;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = r6;
        }
        if ((i & 64) == 0) {
            this.g = Y6.Companion.M0(0);
        } else {
            this.g = y6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = n7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = c0683z7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = g7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = c0656w7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = d7;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = k7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = c5673g;
        }
        this.o = (i & 16384) == 0 ? O6.Companion.M0(0) : o6;
        if ((32768 & i) == 0) {
            this.p = 0;
        } else {
            this.p = i2;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = c0679z3;
        }
        this.r = (i & 131072) == 0 ? kotlin.collections.I.a : list;
    }

    public final C0656w7 a() {
        C0656w7 c0656w7 = this.k;
        if (c0656w7 != null) {
            return c0656w7;
        }
        C0656w7.Companion.getClass();
        return C0656w7.g;
    }

    public final K7 b() {
        K7 k7 = this.m;
        if (k7 != null) {
            return k7;
        }
        K7.Companion.getClass();
        return K7.f;
    }

    public final N7 c() {
        N7 n7 = this.h;
        if (n7 != null) {
            return n7;
        }
        N7.Companion.getClass();
        return N7.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z6)) {
            return false;
        }
        Z6 z6 = (Z6) obj;
        return Intrinsics.b(this.a, z6.a) && Intrinsics.b(this.b, z6.b) && Intrinsics.b(this.c, z6.c) && this.d == z6.d && Intrinsics.b(this.e, z6.e) && Intrinsics.b(this.f, z6.f) && Intrinsics.b(this.g, z6.g) && Intrinsics.b(this.h, z6.h) && Intrinsics.b(this.i, z6.i) && Intrinsics.b(this.j, z6.j) && Intrinsics.b(this.k, z6.k) && Intrinsics.b(this.l, z6.l) && Intrinsics.b(this.m, z6.m) && Intrinsics.b(this.n, z6.n) && Intrinsics.b(this.o, z6.o) && this.p == z6.p && Intrinsics.b(this.q, z6.q) && Intrinsics.b(this.r, z6.r);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cn.jiguang.commons.a.A.i(Ie.K0.d(Ie.K0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31)) * 31;
        R6 r6 = this.f;
        int iHashCode2 = (this.g.hashCode() + ((iHashCode + (r6 == null ? 0 : r6.hashCode())) * 31)) * 31;
        N7 n7 = this.h;
        int iHashCode3 = (iHashCode2 + (n7 == null ? 0 : n7.hashCode())) * 31;
        C0683z7 c0683z7 = this.i;
        int iHashCode4 = (iHashCode3 + (c0683z7 == null ? 0 : c0683z7.hashCode())) * 31;
        G7 g7 = this.j;
        int iHashCode5 = (iHashCode4 + (g7 == null ? 0 : g7.a.hashCode())) * 31;
        C0656w7 c0656w7 = this.k;
        int iHashCode6 = (iHashCode5 + (c0656w7 == null ? 0 : c0656w7.hashCode())) * 31;
        D7 d7 = this.l;
        int iHashCode7 = (iHashCode6 + (d7 == null ? 0 : d7.a.hashCode())) * 31;
        K7 k7 = this.m;
        int iHashCode8 = (iHashCode7 + (k7 == null ? 0 : k7.hashCode())) * 31;
        C5673g c5673g = this.n;
        int iA = cn.jiguang.commons.a.A.A(this.p, (this.o.hashCode() + ((iHashCode8 + (c5673g == null ? 0 : c5673g.hashCode())) * 31)) * 31, 31);
        C0679z3 c0679z3 = this.q;
        return this.r.hashCode() + ((iA + (c0679z3 != null ? c0679z3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = A8.b.l("ToolBlock(toolCallId=", this.a, ", name=", this.b, ", args=");
        S0.b.w(this.c, ", isError=", ", errorCode=", sbL, this.d);
        sbL.append(this.e);
        sbL.append(", _mcp=");
        sbL.append(this.f);
        sbL.append(", status=");
        sbL.append(this.g);
        sbL.append(", _task=");
        sbL.append(this.h);
        sbL.append(", _createSubagent=");
        sbL.append(this.i);
        sbL.append(", _slidesGenerator=");
        sbL.append(this.j);
        sbL.append(", _appVersion=");
        sbL.append(this.k);
        sbL.append(", _cronJob=");
        sbL.append(this.l);
        sbL.append(", _subagent=");
        sbL.append(this.m);
        sbL.append(", _paywall=");
        sbL.append(this.n);
        sbL.append(", loadType=");
        sbL.append(this.o);
        sbL.append(", contentCount=");
        sbL.append(this.p);
        sbL.append(", _plugin=");
        sbL.append(this.q);
        sbL.append(", contents=");
        sbL.append(this.r);
        sbL.append(")");
        return sbL.toString();
    }

    public Z6(String str, String str2, String str3, boolean z, zc.N1 n1, R6 r6, Y6 y6, N7 n7, C0683z7 c0683z7, G7 g7, C0656w7 c0656w7, D7 d7, K7 k7, C5673g c5673g, O6 o6, int i, C0679z3 c0679z3, List list) {
        Intrinsics.checkNotNullParameter(str, "toolCallId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "args");
        Intrinsics.checkNotNullParameter(n1, "errorCode");
        Intrinsics.checkNotNullParameter(y6, "status");
        Intrinsics.checkNotNullParameter(o6, "loadType");
        Intrinsics.checkNotNullParameter(list, "contents");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = n1;
        this.f = r6;
        this.g = y6;
        this.h = n7;
        this.i = c0683z7;
        this.j = g7;
        this.k = c0656w7;
        this.l = d7;
        this.m = k7;
        this.n = c5673g;
        this.o = o6;
        this.p = i;
        this.q = c0679z3;
        this.r = list;
    }

    public Z6() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, zc.N1.Companion.M0(0), null, Y6.Companion.M0(0), null, null, null, null, null, null, null, O6.Companion.M0(0), 0, null, kotlin.collections.I.a);
    }
}
