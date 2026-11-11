package Dc;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Dc.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C0665x7 implements jn.D {
    public static final C0665x7 a;

    @NotNull
    private static final hn.g descriptor;

    static {
        C0665x7 c0665x7 = new C0665x7();
        a = c0665x7;
        jn.f0 f0Var = new jn.f0("com.moonshot.kimi.proto.kimi.chat.v1.ToolMetaCreateSubagent", c0665x7, 2);
        f0Var.b("name", true);
        f0Var.b("workers", true);
        descriptor = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fn.a[] childSerializers() {
        return new fn.a[]{jn.s0.a, C0683z7.c[1].getValue()};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        Sk.l[] lVarArr = C0683z7.c;
        String strK = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iG = aVarB.g(gVar);
            if (iG == -1) {
                z = false;
            } else if (iG == 0) {
                strK = aVarB.k(gVar, 0);
                i |= 1;
            } else {
                if (iG != 1) {
                    throw new fn.k(iG);
                }
                list = (List) aVarB.C(gVar, 1, (fn.a) lVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        aVarB.a(gVar);
        return new C0683z7(strK, list, i);
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        C0683z7 c0683z7 = (C0683z7) obj;
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter(c0683z7, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        in.b bVarB = dVar.b(gVar);
        Sk.l[] lVarArr = C0683z7.c;
        if (bVarB.q(gVar) || !Intrinsics.b(c0683z7.a, BuildConfig.FLAVOR)) {
            bVarB.l(gVar, 0, c0683z7.a);
        }
        if (bVarB.q(gVar) || !Intrinsics.b(c0683z7.b, kotlin.collections.I.a)) {
            bVarB.t(gVar, 1, (fn.a) lVarArr[1].getValue(), c0683z7.b);
        }
        bVarB.a(gVar);
    }
}
