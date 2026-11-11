package ve;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ue.C4795f;
import ue.C4801l;

/* JADX INFO: renamed from: ve.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C5147q0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ P1.f0 b;

    public /* synthetic */ C5147q0(P1.f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                C4795f c4795f = (C4795f) this.b.h;
                if (c4795f != null) {
                    return c4795f.d;
                }
                Intrinsics.l("chatStream");
                throw null;
            case 1:
                C4795f c4795f2 = (C4795f) this.b.h;
                if (c4795f2 != null) {
                    return c4795f2.d;
                }
                Intrinsics.l("chatStream");
                throw null;
            case 2:
                C4801l c4801l = (C4801l) this.b.i;
                if (c4801l != null) {
                    return c4801l.f;
                }
                Intrinsics.l("serviceImpl");
                throw null;
            default:
                return Ie.K0.A("Network reconnected, checkContinue, chatId: ", this.b.o());
        }
    }
}
