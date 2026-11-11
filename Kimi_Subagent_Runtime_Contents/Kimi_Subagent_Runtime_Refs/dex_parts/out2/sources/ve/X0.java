package ve;

import Mc.B4;
import Mc.C1557t0;
import eg.C3109Q;
import eg.C3114W;
import eg.EnumC3133p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;
import xc.C5571b;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class X0 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ P1.f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(P1.f0 f0Var, Vk.a aVar) {
        super(2, aVar);
        this.b = f0Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new X0(this.b, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        P1.f0 f0Var = this.b;
        if (i == 0) {
            P8.a.s(obj);
            Mc.F0 f0 = (Mc.F0) f0Var.b;
            C4801l c4801l = (C4801l) f0Var.i;
            if (c4801l == null) {
                Intrinsics.l("serviceImpl");
                throw null;
            }
            B4 b4 = new B4(c4801l.a, 6);
            this.a = 1;
            C5571b c5571b = f0.a;
            C3109Q c3109q = C3109Q.a;
            Function1 function1 = c5571b.a.b;
            EnumC3133p enumC3133p = EnumC3133p.a;
            Bk.q.a.getClass();
            obj = Mm.E.I(Mm.P.a, new C1557t0(b4, function1, Bk.p.b, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
        }
        C3114W c3114w = (C3114W) obj;
        if (c3114w.f && (obj2 = c3114w.c) != null) {
            P1.f0.r(f0Var, (Zd.A) null, (Pm.h) obj2, 5);
        }
        return Unit.a;
    }
}
