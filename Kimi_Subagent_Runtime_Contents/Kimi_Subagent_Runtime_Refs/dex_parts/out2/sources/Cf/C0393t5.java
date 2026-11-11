package Cf;

import je.C3695k0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;

/* JADX INFO: renamed from: Cf.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C0393t5 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0439y6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0393t5(C0439y6 c0439y6, Vk.a aVar) {
        super(2, aVar);
        this.b = c0439y6;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        C0393t5 c0393t5 = new C0393t5(this.b, aVar);
        c0393t5.a = obj;
        return c0393t5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((H) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        H h = (H) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        String str = h.a;
        C3695k0 c3695k0 = h.b;
        Bj.f fVar = h.c;
        Intrinsics.checkNotNullParameter(str, "enterMethod");
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(fVar, "resultBlock");
        boolean z = !c3695k0.A();
        C0439y6 c0439y6 = this.b;
        C4801l c4801l = c0439y6.n;
        Ag.R0 r0 = new Ag.R0(str, z, c3695k0, c0439y6, fVar);
        c4801l.getClass();
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(r0, "resultBlock");
        P1.f0 f0Var = c4801l.c;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(r0, "resultBlock");
        Mm.E.z(f0Var.q(), (CoroutineContext) null, (Mm.C) null, new ve.Z0(f0Var, c3695k0, false, r0, null), 3);
        return Unit.a;
    }
}
