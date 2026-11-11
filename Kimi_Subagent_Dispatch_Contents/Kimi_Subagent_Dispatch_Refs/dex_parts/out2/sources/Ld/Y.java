package Ld;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import vb.AbstractC4918i;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(f0 f0Var, Vk.a aVar) {
        super(2, aVar);
        this.b = f0Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        Y y = new Y(this.b, aVar);
        y.a = obj;
        return y;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((A) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sk.o */
    public final Object invokeSuspend(Object obj) throws Sk.o {
        A a = (A) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        f0 f0Var = this.b;
        G2.l lVar = f0Var.r;
        G g = f0Var.o;
        AbstractC4918i abstractC4918i = a.a;
        if (abstractC4918i instanceof C1400o) {
            boolean z = ((C1400o) abstractC4918i).a;
            Function1 function1 = a.b;
            if (z) {
                f0Var.A(new Hf.P(13, f0Var, function1));
            } else {
                f0.I(f0Var, function1);
            }
        } else if (abstractC4918i instanceof C1401p) {
            Rd.p pVarA = g.a();
            pVarA.getClass();
            boolean z2 = pVarA instanceof Rd.m;
            lVar.g(new Rd.z(!z2, false));
            Y6.k kVar = new Y6.k("msh_call_click_pause", 29);
            kVar.y(!z2 ? "pause" : "resume", "pause_action");
            kVar.v();
        } else {
            if (!(abstractC4918i instanceof C1399n)) {
                throw new Sk.o();
            }
            Rd.p pVarA2 = g.a();
            if (pVarA2 instanceof Rd.k) {
                f0Var.s.f(true);
                f0Var.s.h(0);
                f0Var.s.g(false);
                lVar.g(Rd.w.a);
                new Y6.k("msh_call_click_interrupt", 29).v();
            } else if (pVarA2 instanceof Rd.i) {
                f0Var.H();
            }
        }
        return Unit.a;
    }
}
