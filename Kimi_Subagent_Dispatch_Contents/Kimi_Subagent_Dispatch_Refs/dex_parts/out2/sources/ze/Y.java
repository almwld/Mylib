package ze;

import je.C3695k0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Z {
    public final C3695k0 c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C3695k0 c3695k0, boolean z) {
        super("VoteMessage.Start");
        Intrinsics.checkNotNullParameter(c3695k0, "message");
        this.c = c3695k0;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return Intrinsics.b(this.c, y.c) && this.d == y.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Start(message=" + this.c + ", thumbUp=" + this.d + ")";
    }
}
