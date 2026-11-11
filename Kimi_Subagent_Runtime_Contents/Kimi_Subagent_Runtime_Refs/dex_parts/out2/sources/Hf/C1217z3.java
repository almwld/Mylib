package Hf;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: renamed from: Hf.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1217z3 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ A3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217z3(C4801l c4801l, A3 a3, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
        this.c = a3;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        C1217z3 c1217z3 = new C1217z3(this.b, this.c, aVar);
        c1217z3.a = obj;
        return c1217z3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Mm.B b = (Mm.B) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        C4801l c4801l = this.b;
        A3 a3 = this.c;
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1169r3(c4801l, a3, null), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1175s3(c4801l, a3, null), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1181t3(c4801l, a3, null), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1193v3(c4801l, null), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1199w3(c4801l, a3, null), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1205x3(a3, null), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1211y3(c4801l, a3, null), 3);
        return Unit.a;
    }
}
