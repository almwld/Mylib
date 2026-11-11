package ve;

import Dc.C0639v;
import Mc.C1451c0;
import Mc.J1;
import Mc.M1;
import eg.C3109Q;
import eg.C3114W;
import eg.EnumC3133p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.C3657O;
import je.C3695k0;
import je.C3697l0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qi.C4277e;
import ue.C4801l;
import xc.C5571b;
import ze.C5866d;
import ze.C5879q;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class W0 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ P1.f0 b;
    public final /* synthetic */ Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(P1.f0 f0Var, Function1 function1, Vk.a aVar) {
        super(2, aVar);
        this.b = f0Var;
        this.c = function1;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new W0(this.b, this.c, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objI;
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
            J1 j1 = new J1(c4801l.a, 2);
            this.a = 1;
            C5571b c5571b = f0.a;
            C3109Q c3109q = C3109Q.a;
            qk.i iVar = C3109Q.h() ? C3109Q.e : C3109Q.c;
            long j = c5571b.a.a;
            EnumC3133p enumC3133p = EnumC3133p.a;
            qk.M.c.getClass();
            qk.s sVar = qk.L.b;
            Bk.q.a.getClass();
            objI = Mm.E.I(Mm.P.a, new C1451c0(qk.E.c, Bk.p.b, j1, iVar, j, sVar, null), this);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
            objI = obj;
        }
        C3114W c3114w = (C3114W) objI;
        M1 m1 = (M1) c3114w.c;
        Mc.I0 i0 = m1 != null ? m1.a : null;
        boolean z = c3114w.f;
        Function1 function1 = this.c;
        if (!z || i0 == null) {
            function1.invoke(Boolean.FALSE);
        } else {
            C4277e c4277e = (C4277e) f0Var.g;
            if (c4277e == null) {
                Intrinsics.l("onEvent");
                throw null;
            }
            C0639v c0639v = i0.b;
            List list = i0.g;
            ArrayList arrayList = new ArrayList(kotlin.collections.A.t(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3695k0((Dc.N) it.next(), (C3697l0) null, 0, (C3657O) null, (je.F0) null, 62));
            }
            c4277e.invoke(new C5879q(c0639v, EnumC5131i0.a, CollectionsKt.l0(arrayList), "showAllReplayMessages"));
            C4277e c4277e2 = (C4277e) f0Var.g;
            if (c4277e2 == null) {
                Intrinsics.l("onEvent");
                throw null;
            }
            Intrinsics.checkNotNullParameter("ChatSharePullCompletion", "name");
            c4277e2.invoke(new C5866d("ChatSharePullCompletion"));
            function1.invoke(Boolean.TRUE);
        }
        return Unit.a;
    }
}
