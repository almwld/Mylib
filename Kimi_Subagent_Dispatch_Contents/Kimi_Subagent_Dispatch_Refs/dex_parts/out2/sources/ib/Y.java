package ib;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Ua.a {
    public static final Parcelable.Creator<Y> CREATOR = new V(12);
    public final long a;
    public final rb.T b;
    public final rb.T c;
    public final rb.T d;

    public Y(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Ta.C.g(bArr);
        rb.T t = rb.T.t(bArr.length, bArr);
        Ta.C.g(bArr2);
        rb.T t2 = rb.T.t(bArr2.length, bArr2);
        Ta.C.g(bArr3);
        rb.T t3 = rb.T.t(bArr3.length, bArr3);
        this.a = j;
        this.b = t;
        this.c = t2;
        this.d = t3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return this.a == y.a && Ta.C.k(this.b, y.b) && Ta.C.k(this.c, y.c) && Ta.C.k(this.d, y.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iN = ub.U.n(parcel, 20293);
        ub.U.m(parcel, 1, 8);
        parcel.writeLong(this.a);
        ub.U.d(parcel, 2, this.b.v());
        ub.U.d(parcel, 3, this.c.v());
        ub.U.d(parcel, 4, this.d.v());
        ub.U.o(parcel, iN);
    }
}
