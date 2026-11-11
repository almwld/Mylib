package ld;

import Ab.E0;
import jd.C3634e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xc.AbstractC5570a;

/* JADX INFO: renamed from: ld.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C3867t extends E0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Ab.E0
    public final AbstractC5570a L0(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        switch (str.hashCode()) {
            case -1888945582:
                if (str.equals("STATUS_RUNNING")) {
                    return C3870w.d;
                }
                break;
            case -666173296:
                if (str.equals("STATUS_TERMINATED")) {
                    return C3871x.d;
                }
                break;
            case 172650026:
                if (str.equals("STATUS_PENDING")) {
                    return C3869v.d;
                }
                break;
            case 1115874890:
                if (str.equals("STATUS_UNSPECIFIED")) {
                    return C3872y.d;
                }
                break;
            case 1290982401:
                if (str.equals("STATUS_IDLE")) {
                    return C3868u.d;
                }
                break;
        }
        return (AbstractC3834A) E0.X0(this, 0, str, 1);
    }

    @Override // Ab.E0
    public final AbstractC5570a W0(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new C3873z(i, str);
    }

    @Override // Ab.E0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final AbstractC3834A M0(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? (AbstractC3834A) E0.X0(this, i, null, 2) : C3871x.d : C3869v.d : C3870w.d : C3868u.d : C3872y.d;
    }

    @NotNull
    public final fn.a serializer() {
        return new C3634e(AbstractC3834A.Companion);
    }
}
