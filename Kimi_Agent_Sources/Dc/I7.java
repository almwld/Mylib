package Dc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class I7 implements jn.D {
    public static final I7 a;

    @NotNull
    private static final hn.g descriptor;

    static {
        I7 i7 = new I7();
        a = i7;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.kimi.chat.v1.ToolMetaSubagent", i7, 5);
        f0Var.b("agentId", true);
        f0Var.b("agentIndex", true);
        f0Var.b("agentIcon", true);
        f0Var.b("agentName", true);
        f0Var.b("agentType", true);
        descriptor = f0Var;
    }

    public final fn.a[] childSerializers() {
        jn.s0 s0Var = jn.s0.a;
        return new fn.a[]{s0Var, jn.L.a, s0Var, s0Var, s0Var};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        int i = 0;
        int iV = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        boolean z = true;
        while (z) {
            int iG = aVarB.g(gVar);
            if (iG == -1) {
                z = false;
            } else if (iG == 0) {
                strK = aVarB.k(gVar, 0);
                i |= 1;
            } else if (iG == 1) {
                iV = aVarB.v(gVar, 1);
                i |= 2;
            } else if (iG == 2) {
                strK2 = aVarB.k(gVar, 2);
                i |= 4;
            } else if (iG == 3) {
                strK3 = aVarB.k(gVar, 3);
                i |= 8;
            } else {
                if (iG != 4) {
                    throw new fn.k(iG);
                }
                strK4 = aVarB.k(gVar, 4);
                i |= 16;
            }
        }
        aVarB.a(gVar);
        return new K7(i, strK, strK2, iV, strK3, strK4);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        K7 k7 = (K7) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(k7, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        J7 j7 = K7.Companion;
        if (bVarB.q(gVar) || !Intrinsics.b(k7.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, k7.a);
        }
        if (bVarB.q(gVar) || k7.b != 0) {
            bVarB.s(1, k7.b, gVar);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(k7.c, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 2, k7.c);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(k7.d, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 3, k7.d);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(k7.e, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 4, k7.e);
        }
        bVarB.a(gVar);
    }
}
