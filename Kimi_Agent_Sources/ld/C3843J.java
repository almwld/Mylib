package ld;

import Ie.K0;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ld.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class C3843J {

    @NotNull
    public static final C3842I Companion = new C3842I();
    public static final Sk.l[] k = {null, null, null, null, null, Sk.m.a(Sk.n.b, new C3863p(1)), null, null, null, null};
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final AbstractC3834A f;
    public final Integer g;
    public final String h;
    public final String i;
    public final boolean j;

    static {
        new C3843J(null, 0, null, null, null, 1023);
    }

    public /* synthetic */ C3843J(int i, String str, int i2, String str2, String str3, String str4, AbstractC3834A abstractC3834A, Integer num, String str5, String str6, boolean z) {
        if ((i & 1) == 0) {
            this.a = BuildConfig.FLAVOR;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = BuildConfig.FLAVOR;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = BuildConfig.FLAVOR;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = BuildConfig.FLAVOR;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = AbstractC3834A.Companion.M0(0);
        } else {
            this.f = abstractC3834A;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = BuildConfig.FLAVOR;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = BuildConfig.FLAVOR;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3843J)) {
            return false;
        }
        C3843J c3843j = (C3843J) obj;
        return Intrinsics.b(this.a, c3843j.a) && this.b == c3843j.b && Intrinsics.b(this.c, c3843j.c) && Intrinsics.b(this.d, c3843j.d) && Intrinsics.b(this.e, c3843j.e) && Intrinsics.b(this.f, c3843j.f) && Intrinsics.b(this.g, c3843j.g) && Intrinsics.b(this.h, c3843j.h) && Intrinsics.b(this.i, c3843j.i) && this.j == c3843j.j;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + K0.d(K0.d(K0.d(cn.jiguang.commons.a.A.A(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31;
        Integer num = this.g;
        return Boolean.hashCode(this.j) + K0.d(K0.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbR = S0.b.r(this.b, "Subagent(id=", this.a, ", index=", ", name=");
        A8.b.x(sbR, this.c, ", iconUrl=", this.d, ", motto=");
        sbR.append(this.e);
        sbR.append(", status=");
        sbR.append(this.f);
        sbR.append(", _progressPercent=");
        sbR.append(this.g);
        sbR.append(", description=");
        sbR.append(this.h);
        sbR.append(", type=");
        sbR.append(this.i);
        sbR.append(", isAsync=");
        sbR.append(this.j);
        sbR.append(")");
        return sbR.toString();
    }

    public C3843J(String str, int i, String str2, String str3, AbstractC3834A abstractC3834A, int i2) {
        str = (i2 & 1) != 0 ? BuildConfig.FLAVOR : str;
        i = (i2 & 2) != 0 ? 0 : i;
        str2 = (i2 & 4) != 0 ? BuildConfig.FLAVOR : str2;
        str3 = (i2 & 8) != 0 ? BuildConfig.FLAVOR : str3;
        abstractC3834A = (i2 & 32) != 0 ? AbstractC3834A.Companion.M0(0) : abstractC3834A;
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "iconUrl");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "motto");
        Intrinsics.checkNotNullParameter(abstractC3834A, "status");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "description");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "type");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = BuildConfig.FLAVOR;
        this.f = abstractC3834A;
        this.g = null;
        this.h = BuildConfig.FLAVOR;
        this.i = BuildConfig.FLAVOR;
        this.j = false;
    }
}
