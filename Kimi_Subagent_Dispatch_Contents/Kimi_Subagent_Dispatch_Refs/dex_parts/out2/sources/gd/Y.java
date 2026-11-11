package gd;

import com.google.firebase.analytics.FirebaseAnalytics;
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
        descriptor = new jn.f0("com.moonshot.kimi.proto.kimi.gateway.skill.v1.ListSkillUseCasesRequest", y, 0);
    }

    public final fn.a[] childSerializers() {
        return new fn.a[0];
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fn.k */
    public final Object deserialize(in.c cVar) throws fn.k {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        hn.g gVar = descriptor;
        in.a aVarB = cVar.b(gVar);
        int iG = aVarB.g(gVar);
        if (iG != -1) {
            throw new fn.k(iG);
        }
        aVarB.a(gVar);
        return new C3325a0();
    }

    public final hn.g getDescriptor() {
        return descriptor;
    }

    public final void serialize(in.d dVar, Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "encoder");
        Intrinsics.checkNotNullParameter((C3325a0) obj, FirebaseAnalytics.Param.VALUE);
        hn.g gVar = descriptor;
        dVar.b(gVar).a(gVar);
    }
}
