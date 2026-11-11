package Dc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class O7 implements jn.D {
    public static final O7 a;

    @NotNull
    private static final hn.g descriptor;

    static {
        O7 o7 = new O7();
        a = o7;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.kimi.chat.v1.ToolSubagentWorker", o7, 3);
        f0Var.b("name", true);
        f0Var.b("iconUrl", true);
        f0Var.b("motto", true);
        descriptor = f0Var;
    }

    public final fn.a[] childSerializers() {
        jn.s0 s0Var = jn.s0.a;
        return new fn.a[]{s0Var, s0Var, s0Var};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        String strK = null;
        boolean z = true;
        int i = 0;
        String strK2 = null;
        String strK3 = null;
        while (z) {
            int iG = aVarB.g(gVar);
            if (iG == -1) {
                z = false;
            } else if (iG == 0) {
                strK = aVarB.k(gVar, 0);
                i |= 1;
            } else if (iG == 1) {
                strK2 = aVarB.k(gVar, 1);
                i |= 2;
            } else {
                if (iG != 2) {
                    throw new fn.k(iG);
                }
                strK3 = aVarB.k(gVar, 2);
                i |= 4;
            }
        }
        aVarB.a(gVar);
        return new Q7(i, strK, strK2, strK3);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        Q7 q7 = (Q7) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(q7, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        P7 p7 = Q7.Companion;
        if (bVarB.q(gVar) || !Intrinsics.b(q7.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, q7.a);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(q7.b, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 1, q7.b);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(q7.c, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 2, q7.c);
        }
        bVarB.a(gVar);
    }
}
