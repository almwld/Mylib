package ue;

import Dm.n;
import Mm.B;
import Mm.E;
import Pm.r0;
import dg.C2978a;
import java.util.List;
import je.C3695k0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import tg.C4526j;

/* JADX INFO: renamed from: ue.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C4799j extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C4801l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4799j(List list, C4801l c4801l, Vk.a aVar) {
        super(2, aVar);
        this.b = list;
        this.c = c4801l;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C4799j(this.b, this.c, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        r0 r0Var = this.c.j;
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        if (i == 0) {
            P8.a.s(obj);
            Dm.e eVar = Dm.f.b;
            long jP = n.p(1000L, Dm.h.c);
            this.a = 1;
            if (E.n(jP, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
        }
        List list = this.b;
        C3695k0 c3695k0 = (C3695k0) CollectionsKt.d0(list);
        if (c3695k0 != null && c3695k0.x() && r0Var.getValue() != list) {
            r0Var.getClass();
            r0Var.k((Object) null, list);
            boolean z = C2978a.a;
            C2978a.a("StreamServiceImpl", null, new C4526j(1, list));
        }
        return Unit.a;
    }
}
