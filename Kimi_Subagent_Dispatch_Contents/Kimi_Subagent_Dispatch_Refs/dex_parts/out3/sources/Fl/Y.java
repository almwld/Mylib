package Fl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public final class Y {
    public c0 a;
    public String b;

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
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.a);
        sb.append(", typeFlexibilityId=");
        return A8.b.i(sb, this.b, ')');
    }
}
