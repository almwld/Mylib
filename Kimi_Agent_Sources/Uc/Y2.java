package Uc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC3834A;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class Y2 implements jn.D {
    public static final Y2 a;

    @NotNull
    private static final hn.g descriptor;

    static {
        Y2 y2 = new Y2();
        a = y2;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.kimi.gateway.im.v1.SubagentStatusEvent", y2, 4);
        f0Var.b("chatId", true);
        f0Var.b("agentId", true);
        f0Var.b("status", true);
        f0Var.b("progressPercent", true);
        descriptor = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fn.a[] childSerializers() {
        Sk.l[] lVarArr = C2011a3.e;
        jn.s0 s0Var = jn.s0.a;
        return new fn.a[]{s0Var, s0Var, lVarArr[2].getValue(), vb.N2.j(jn.L.a)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        Sk.l[] lVarArr = C2011a3.e;
        int i = 0;
        String strK = null;
        String strK2 = null;
        AbstractC3834A abstractC3834A = null;
        Integer num = null;
        boolean z = true;
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
            } else if (iG == 2) {
                abstractC3834A = (AbstractC3834A) aVarB.C(gVar, 2, (fn.a) lVarArr[2].getValue(), abstractC3834A);
                i |= 4;
            } else {
                if (iG != 3) {
                    throw new fn.k(iG);
                }
                num = (Integer) aVarB.l(gVar, 3, jn.L.a, num);
                i |= 8;
            }
        }
        aVarB.a(gVar);
        return new C2011a3(i, strK, strK2, abstractC3834A, num);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        C2011a3 c2011a3 = (C2011a3) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(c2011a3, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        Sk.l[] lVarArr = C2011a3.e;
        if (bVarB.q(gVar) || !Intrinsics.b(c2011a3.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, c2011a3.a);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c2011a3.b, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 1, c2011a3.b);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c2011a3.c, AbstractC3834A.Companion.M0(0))) {
            bVarB.t(gVar, 2, (fn.a) lVarArr[2].getValue(), c2011a3.c);
        }
        if (bVarB.q(gVar) || c2011a3.d != null) {
            bVarB.u(gVar, 3, jn.L.a, c2011a3.d);
        }
        bVarB.a(gVar);
    }
}
