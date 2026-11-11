package Cf;

import je.C3695k0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;

/* JADX INFO: renamed from: Cf.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C0384s5 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0439y6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384s5(C0439y6 c0439y6, Vk.a aVar) {
        super(2, aVar);
        this.b = c0439y6;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        C0384s5 c0384s5 = new C0384s5(this.b, aVar);
        c0384s5.a = obj;
        return c0384s5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((C0326m0) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        C0326m0 c0326m0 = (C0326m0) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        C3695k0 c3695k0 = c0326m0.a;
        Rf.m mVar = C0439y6.s;
        C0265f2 c0265f2 = new C0265f2(6);
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(c0265f2, "resultBlock");
        boolean z = !c3695k0.B();
        C0439y6 c0439y6 = this.b;
        C4801l c4801l = c0439y6.n;
        C0374r4 c0374r4 = new C0374r4(z, c3695k0, c0439y6, c0265f2, 0);
        c4801l.getClass();
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(c0374r4, "resultBlock");
        P1.f0 f0Var = c4801l.c;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(c0374r4, "resultBlock");
        Mm.E.z(f0Var.q(), (CoroutineContext) null, (Mm.C) null, new ve.Z0(f0Var, c3695k0, true, c0374r4, null), 3);
        return Unit.a;
    }
}
