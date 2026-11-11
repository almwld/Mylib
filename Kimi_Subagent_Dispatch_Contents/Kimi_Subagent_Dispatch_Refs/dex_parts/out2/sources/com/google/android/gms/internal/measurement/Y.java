package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iU = ub.T.u(parcel);
                Bundle bundleB = null;
                String strE = null;
                boolean zM = false;
                long jR = 0;
                long jR2 = 0;
                while (parcel.dataPosition() < iU) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        jR = ub.T.r(parcel, i);
                    } else if (c == 2) {
                        jR2 = ub.T.r(parcel, i);
                    } else if (c == 3) {
                        zM = ub.T.m(parcel, i);
                    } else if (c == 7) {
                        bundleB = ub.T.b(parcel, i);
                    } else if (c != '\b') {
                        ub.T.t(parcel, i);
                    } else {
                        strE = ub.T.e(parcel, i);
                    }
                }
                ub.T.j(parcel, iU);
                return new X(jR, jR2, zM, bundleB, strE);
            default:
                int iU2 = ub.T.u(parcel);
                String strE2 = null;
                int iP = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iU2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iP = ub.T.p(parcel, i2);
                    } else if (c2 == 2) {
                        strE2 = ub.T.e(parcel, i2);
                    } else if (c2 != 3) {
                        ub.T.t(parcel, i2);
                    } else {
                        intent = (Intent) ub.T.d(parcel, i2, Intent.CREATOR);
                    }
                }
                ub.T.j(parcel, iU2);
                return new Z(iP, strE2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new X[i];
            default:
                return new Z[i];
        }
    }
}
