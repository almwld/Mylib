package Dc;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class Y {

    @NotNull
    public static final X Companion = new X();
    public static final Sk.l[] h = {null, null, null, null, null, null, Sk.m.a(Sk.n.b, new C0612s(16))};
    public static final Y i = new Y();
    public final String a;
    public final C0639v b;
    public final C0461b0 c;
    public final String d;
    public final String e;
    public final r f;
    public final List g;

    public Y(int i2, String str, C0639v c0639v, C0461b0 c0461b0, String str2, String str3, r rVar, List list) {
        if ((i2 & 1) == 0) {
            this.a = BuildConfig.FLAVOR;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = c0639v;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = c0461b0;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i2 & 16) == 0) {
            this.e = BuildConfig.FLAVOR;
        } else {
            this.e = str3;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = rVar;
        }
        if ((i2 & 64) == 0) {
            this.g = kotlin.collections.I.a;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return Intrinsics.b(this.a, y.a) && Intrinsics.b(this.b, y.b) && Intrinsics.b(this.c, y.c) && Intrinsics.b(this.d, y.d) && Intrinsics.b(this.e, y.e) && Intrinsics.b(this.f, y.f) && Intrinsics.b(this.g, y.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C0639v c0639v = this.b;
        int iHashCode2 = (iHashCode + (c0639v == null ? 0 : c0639v.hashCode())) * 31;
        C0461b0 c0461b0 = this.c;
        int iHashCode3 = (iHashCode2 + (c0461b0 == null ? 0 : c0461b0.hashCode())) * 31;
        String str = this.d;
        int iD = Ie.K0.d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        r rVar = this.f;
        return this.g.hashCode() + ((iD + (rVar != null ? rVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatShare(id=");
        sb2.append(this.a);
        sb2.append(", _chat=");
        sb2.append(this.b);
        sb2.append(", _creator=");
        sb2.append(this.c);
        sb2.append(", _createTime=");
        sb2.append(this.d);
        sb2.append(", url=");
        sb2.append(this.e);
        sb2.append(", _card=");
        sb2.append(this.f);
        sb2.append(", messages=");
        return v.z.j(sb2, this.g, ")");
    }

    public Y(String str, C0639v c0639v, C0461b0 c0461b0, String str2, String str3, r rVar, List list) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str3, "url");
        Intrinsics.checkNotNullParameter(list, "messages");
        this.a = str;
        this.b = c0639v;
        this.c = c0461b0;
        this.d = str2;
        this.e = str3;
        this.f = rVar;
        this.g = list;
    }

    public Y() {
        this(BuildConfig.FLAVOR, null, null, null, BuildConfig.FLAVOR, null, kotlin.collections.I.a);
    }
}
