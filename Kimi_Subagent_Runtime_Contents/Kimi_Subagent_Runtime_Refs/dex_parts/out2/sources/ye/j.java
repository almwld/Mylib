package ye;

import Bk.p;
import Bk.q;
import Dc.C0572n3;
import Dc.C0639v;
import Dc.N;
import Mc.C1446b2;
import Mc.C1467e2;
import Mc.C1479g0;
import Mm.B;
import Mm.E;
import Mm.P;
import Pm.r0;
import eg.C3109Q;
import eg.C3114W;
import eg.EnumC3133p;
import java.util.List;
import je.A0;
import je.C3695k0;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qk.L;
import qk.M;
import qk.s;
import ue.C4801l;
import xc.C5571b;
import ze.C5886y;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class j extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ C3695k0 c;
    public final /* synthetic */ C5726a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C4801l c4801l, C3695k0 c3695k0, C5726a c5726a, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
        this.c = c3695k0;
        this.d = c5726a;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new j(this.b, this.c, this.d, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objI;
        C4801l c4801l = this.b;
        r0 r0Var = c4801l.i;
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        C3695k0 c3695k0 = this.c;
        if (i == 0) {
            P8.a.s(obj);
            if (((C0639v) r0Var.getValue()).a.length() == 0) {
                return Unit.a;
            }
            if (c3695k0 != null) {
                N n = c3695k0.a;
                if (c3695k0.n()) {
                    if (Intrinsics.b(n.e(), C0572n3.d)) {
                        return Unit.a;
                    }
                    C5571b c5571b = C5571b.b;
                    Intrinsics.checkNotNullParameter(c5571b, "client");
                    C1446b2 c1446b2 = new C1446b2(((C0639v) r0Var.getValue()).a, n.a);
                    this.a = 1;
                    C3109Q c3109q = C3109Q.a;
                    qk.i iVar = C3109Q.h() ? C3109Q.e : C3109Q.c;
                    long j = c5571b.a.a;
                    EnumC3133p enumC3133p = EnumC3133p.a;
                    M.c.getClass();
                    s sVar = L.b;
                    q.a.getClass();
                    objI = E.I(P.a, new C1479g0(qk.E.c, p.b, c1446b2, iVar, j, sVar, null), this);
                    if (objI == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P8.a.s(obj);
        objI = obj;
        C1467e2 c1467e2 = (C1467e2) ((C3114W) objI).c;
        List list = c1467e2 != null ? c1467e2.a : null;
        String str = ((C0639v) r0Var.getValue()).a;
        String str2 = c3695k0.a.a;
        if (list == null) {
            list = I.a;
        }
        c4801l.d(new C5886y(new A0(str, list, str2)));
        return Unit.a;
    }
}
