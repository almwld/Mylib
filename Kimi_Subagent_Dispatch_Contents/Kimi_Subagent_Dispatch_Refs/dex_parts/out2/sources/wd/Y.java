package wd;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
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
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.moment.v1.ChatShareCard.ImageWithDominantColor", y, 3);
        f0Var.b("imageInfo", true);
        f0Var.b("dominantColor", true);
        f0Var.b("remixPrompt", true);
        descriptor = f0Var;
    }

    public final fn.a[] childSerializers() {
        jn.s0 s0Var = jn.s0.a;
        return new fn.a[]{vb.N2.j(C5266g5.a), s0Var, s0Var};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        C5290i5 c5290i5 = null;
        boolean z = true;
        int i = 0;
        String strK = null;
        String strK2 = null;
        while (z) {
            int iG = aVarB.g(gVar);
            if (iG == -1) {
                z = false;
            } else if (iG == 0) {
                c5290i5 = (C5290i5) aVarB.l(gVar, 0, C5266g5.a, c5290i5);
                i |= 1;
            } else if (iG == 1) {
                strK = aVarB.k(gVar, 1);
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
        return new C5183a0(i, c5290i5, strK, strK2);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        C5183a0 c5183a0 = (C5183a0) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(c5183a0, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        Z z = C5183a0.Companion;
        if (bVarB.q(gVar) || c5183a0.a != null) {
            bVarB.u(gVar, 0, C5266g5.a, c5183a0.a);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c5183a0.b, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 1, c5183a0.b);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c5183a0.c, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 2, c5183a0.c);
        }
        bVarB.a(gVar);
    }
}
