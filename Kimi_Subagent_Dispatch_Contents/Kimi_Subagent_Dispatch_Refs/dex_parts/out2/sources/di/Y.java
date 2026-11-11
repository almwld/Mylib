package di;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class Y implements jn.D {
    public static final Y a;

    @NotNull
    private static final hn.g descriptor;

    static {
        Y y = new Y();
        a = y;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimichat.route.model.MainPages.KimiMyRoute", y, 3);
        f0Var.b(Constants.MessagePayloadKeys.FROM, true);
        f0Var.b("needLogin", true);
        f0Var.b("fromPage", false);
        descriptor = f0Var;
    }

    public final fn.a[] childSerializers() {
        jn.s0 s0Var = jn.s0.a;
        return new fn.a[]{s0Var, jn.g.a, s0Var};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        String strK = null;
        boolean z = true;
        int i = 0;
        boolean zQ = false;
        String strK2 = null;
        while (z) {
            int iG = aVarB.g(gVar);
            if (iG == -1) {
                z = false;
            } else if (iG == 0) {
                strK = aVarB.k(gVar, 0);
                i |= 1;
            } else if (iG == 1) {
                zQ = aVarB.q(gVar, 1);
                i |= 2;
            } else {
                if (iG != 2) {
                    throw new fn.k(iG);
                }
                strK2 = aVarB.k(gVar, 2);
                i |= 4;
            }
        }
        aVarB.a(gVar);
        return new C2993a0(strK, strK2, zQ, i);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        C2993a0 c2993a0 = (C2993a0) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(c2993a0, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        C3019j.a(c2993a0, bVarB, gVar);
        bVarB.l(gVar, 2, c2993a0.c);
        bVarB.a(gVar);
    }
}
