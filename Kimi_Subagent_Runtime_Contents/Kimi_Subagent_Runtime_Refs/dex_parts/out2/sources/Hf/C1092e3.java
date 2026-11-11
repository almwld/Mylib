package Hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Hf.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1092e3 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ A3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092e3(A3 a3, Vk.a aVar) {
        super(2, aVar);
        this.b = a3;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C1092e3(this.b, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        A3 a3 = this.b;
        Cf.P3 p3 = a3.j;
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        if (i == 0) {
            P8.a.s(obj);
            Hd.r.B(a3, null, false, false, 15);
            Ae.f fVar = Ae.f.a;
            String str = p3.p().a;
            this.a = 1;
            obj = fVar.h(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
        }
        String strP = (String) obj;
        a3.t();
        if (strP == null) {
            p3.y0.j(false);
        } else {
            if (strP.length() == 0) {
                strP = Pf.B.p(Qk.X.b());
            }
            Pf.B.L(strP, null, 6);
        }
        return Unit.a;
    }
}
