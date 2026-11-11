package Uc;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC3834A;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Uc.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
@fn.g
public final class C2011a3 {

    @NotNull
    public static final Z2 Companion = new Z2();
    public static final Sk.l[] e = {null, null, Sk.m.a(Sk.n.b, new C2080p1(15)), null};
    public static final C2011a3 f = new C2011a3();
    public final String a;
    public final String b;
    public final AbstractC3834A c;
    public final Integer d;

    public /* synthetic */ C2011a3(int i, String str, String str2, AbstractC3834A abstractC3834A, Integer num) {
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
            this.c = AbstractC3834A.Companion.M0(0);
        } else {
            this.c = abstractC3834A;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011a3)) {
            return false;
        }
        C2011a3 c2011a3 = (C2011a3) obj;
        return Intrinsics.b(this.a, c2011a3.a) && Intrinsics.b(this.b, c2011a3.b) && Intrinsics.b(this.c, c2011a3.c) && Intrinsics.b(this.d, c2011a3.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + Ie.K0.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbL = A8.b.l("SubagentStatusEvent(chatId=", this.a, ", agentId=", this.b, ", status=");
        sbL.append(this.c);
        sbL.append(", _progressPercent=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }

    public C2011a3() {
        AbstractC3834A abstractC3834AM0 = AbstractC3834A.Companion.M0(0);
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "chatId");
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "agentId");
        Intrinsics.checkNotNullParameter(abstractC3834AM0, "status");
        this.a = BuildConfig.FLAVOR;
        this.b = BuildConfig.FLAVOR;
        this.c = abstractC3834AM0;
        this.d = null;
    }
}
