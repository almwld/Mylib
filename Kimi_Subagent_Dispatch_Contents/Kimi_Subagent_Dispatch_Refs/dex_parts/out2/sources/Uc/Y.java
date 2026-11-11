package Uc;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class Y {

    @NotNull
    public static final X Companion = new X();
    public final String a;
    public final C2060k2 b;
    public final C2105w c;
    public final C2085q2 d;
    public final u3 e;
    public final V f;
    public final C2017c g;
    public final C2117z h;
    public final C2070n i;
    public final C2011a3 j;
    public final Zc.u k;
    public final C2045h2 l;
    public final C2073n2 m;
    public final Z1 n;

    static {
        new Y();
    }

    public Y() {
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        this.a = BuildConfig.FLAVOR;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return Intrinsics.b(this.a, y.a) && Intrinsics.b(this.b, y.b) && Intrinsics.b(this.c, y.c) && Intrinsics.b(this.d, y.d) && Intrinsics.b(this.e, y.e) && Intrinsics.b(this.f, y.f) && Intrinsics.b(this.g, y.g) && Intrinsics.b(this.h, y.h) && Intrinsics.b(this.i, y.i) && Intrinsics.b(this.j, y.j) && Intrinsics.b(this.k, y.k) && Intrinsics.b(this.l, y.l) && Intrinsics.b(this.m, y.m) && Intrinsics.b(this.n, y.n);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + (this.b == null ? 0 : Integer.hashCode(0))) * 31;
        C2105w c2105w = this.c;
        int iHashCode2 = (((iHashCode + (c2105w == null ? 0 : c2105w.hashCode())) * 31) + (this.d == null ? 0 : Integer.hashCode(0))) * 31;
        u3 u3Var = this.e;
        int iHashCode3 = (iHashCode2 + (u3Var == null ? 0 : u3Var.hashCode())) * 31;
        V v = this.f;
        int iHashCode4 = (((iHashCode3 + (v == null ? 0 : v.a.hashCode())) * 31) + (this.g == null ? 0 : Integer.hashCode(0))) * 31;
        C2117z c2117z = this.h;
        int iHashCode5 = (iHashCode4 + (c2117z == null ? 0 : c2117z.hashCode())) * 31;
        C2070n c2070n = this.i;
        int iHashCode6 = (iHashCode5 + (c2070n == null ? 0 : c2070n.hashCode())) * 31;
        C2011a3 c2011a3 = this.j;
        int iHashCode7 = (iHashCode6 + (c2011a3 == null ? 0 : c2011a3.hashCode())) * 31;
        Zc.u uVar = this.k;
        int iHashCode8 = (iHashCode7 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        C2045h2 c2045h2 = this.l;
        int iHashCode9 = (((iHashCode8 + (c2045h2 == null ? 0 : c2045h2.a.hashCode())) * 31) + (this.m == null ? 0 : Integer.hashCode(0))) * 31;
        Z1 z1 = this.n;
        return iHashCode9 + (z1 != null ? z1.hashCode() : 0);
    }

    public final String toString() {
        return "Event(id=" + this.a + ", _ping=" + this.b + ", _chatMessage=" + this.c + ", _reconnect=" + this.d + ", _typing=" + this.e + ", _disband=" + this.f + ", _botReport=" + this.g + ", _chatStatus=" + this.h + ", _chatChange=" + this.i + ", _subagentStatus=" + this.j + ", _notification=" + this.k + ", _operation=" + this.l + ", _pong=" + this.m + ", _notificationEvent=" + this.n + ")";
    }

    public /* synthetic */ Y(int i, String str, C2060k2 c2060k2, C2105w c2105w, C2085q2 c2085q2, u3 u3Var, V v, C2017c c2017c, C2117z c2117z, C2070n c2070n, C2011a3 c2011a3, Zc.u uVar, C2045h2 c2045h2, C2073n2 c2073n2, Z1 z1) {
        this.a = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = c2060k2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = c2105w;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = c2085q2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = u3Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = v;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = c2017c;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = c2117z;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = c2070n;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = c2011a3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = uVar;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = c2045h2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = c2073n2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = z1;
        }
    }
}
