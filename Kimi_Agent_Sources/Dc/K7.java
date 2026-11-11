package Dc;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class K7 {

    @NotNull
    public static final J7 Companion = new J7();
    public static final K7 f = new K7();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public K7() {
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "agentId");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "agentIcon");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "agentName");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "agentType");
        this.a = BuildConfig.FLAVOR;
        this.b = 0;
        this.c = BuildConfig.FLAVOR;
        this.d = BuildConfig.FLAVOR;
        this.e = BuildConfig.FLAVOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K7)) {
            return false;
        }
        K7 k7 = (K7) obj;
        return Intrinsics.b(this.a, k7.a) && this.b == k7.b && Intrinsics.b(this.c, k7.c) && Intrinsics.b(this.d, k7.d) && Intrinsics.b(this.e, k7.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + Ie.K0.d(Ie.K0.d(cn.jiguang.commons.a.A.A(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = S0.b.r(this.b, "ToolMetaSubagent(agentId=", this.a, ", agentIndex=", ", agentIcon=");
        A8.b.x(sbR, this.c, ", agentName=", this.d, ", agentType=");
        return A8.b.j(sbR, this.e, ")");
    }

    public /* synthetic */ K7(int i, String str, String str2, int i2, String str3, String str4) {
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
    }
}
