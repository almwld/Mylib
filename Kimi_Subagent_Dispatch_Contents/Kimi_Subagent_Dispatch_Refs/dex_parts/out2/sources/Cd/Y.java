package Cd;

import Ie.K0;
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
    public final String c;
    public final String d;

    public Y() {
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "spaceId");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "status");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "updatedAt");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "watermark");
        this.a = BuildConfig.FLAVOR;
        this.b = BuildConfig.FLAVOR;
        this.c = BuildConfig.FLAVOR;
        this.d = BuildConfig.FLAVOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return Intrinsics.b(this.a, y.a) && Intrinsics.b(this.b, y.b) && Intrinsics.b(this.c, y.c) && Intrinsics.b(this.d, y.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + K0.d(K0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return A8.b.k(A8.b.l("Space(spaceId=", this.a, ", status=", this.b, ", updatedAt="), this.c, ", watermark=", this.d, ")");
    }

    public /* synthetic */ Y(int i, String str, String str2, String str3, String str4) {
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
    }
}
