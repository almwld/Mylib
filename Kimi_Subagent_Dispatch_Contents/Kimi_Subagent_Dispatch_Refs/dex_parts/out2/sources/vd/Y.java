package vd;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class Y {

    @NotNull
    public static final X Companion = new X();
    public final String a;
    public final String b;

    static {
        new Y();
    }

    public Y() {
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "userId");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "name");
        this.a = BuildConfig.FLAVOR;
        this.b = BuildConfig.FLAVOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return Intrinsics.b(this.a, y.a) && Intrinsics.b(this.b, y.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v.z.h("MentionedUser(userId=", this.a, ", name=", this.b, ")");
    }

    public /* synthetic */ Y(int i, String str, String str2) {
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
    }
}
