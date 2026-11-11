package ye;

import Dc.C0639v;
import Mm.B;
import Mm.C;
import Mm.E;
import Mm.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import je.C3695k0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.collections.P;
import kotlin.collections.y;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ue.C4795f;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class l extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ C4795f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C4795f c4795f, String str, boolean z, Vk.a aVar) {
        super(2, aVar);
        this.b = c4795f;
        this.c = str;
        this.d = z;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new l(this.b, this.c, this.d, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        String str = this.c;
        C4795f c4795f = this.b;
        if (i == 0) {
            P8.a.s(obj);
            this.a = 1;
            obj = C4795f.b(c4795f, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
        }
        List list = (List) obj;
        if (list == null) {
            if (((Map) c4795f.c).get(str) == null) {
                c4795f.c = P.k((Map) c4795f.c, new Pair(str, y.c(C3695k0.i)));
                c4795f.d(false);
            }
            return Unit.a;
        }
        List list2 = (List) ((Map) c4795f.c).get(str);
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            List<C3695k0> list4 = list;
            ArrayList arrayList = new ArrayList(A.t(list4, 10));
            for (C3695k0 c3695k0 : list4) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C3695k0) next).G(c3695k0)) {
                        break;
                    }
                }
                C3695k0 c3695k02 = (C3695k0) next;
                if (c3695k02 != null) {
                    c3695k0 = c3695k02;
                }
                arrayList.add(c3695k0);
            }
            list = arrayList;
        }
        c4795f.c = P.k((Map) c4795f.c, new Pair(str, list));
        c4795f.d(false);
        C3695k0 c3695k03 = (C3695k0) CollectionsKt.d0(list);
        if (!this.d) {
            C4801l c4801l = c4795f.b;
            if (c4801l == null) {
                Intrinsics.l("service");
                throw null;
            }
            if (c4801l.a.length() == 0 && c3695k03 != null && c3695k03.x()) {
                String str2 = c3695k03.a.a;
                int i2 = c3695k03.c;
                C4801l c4801l2 = c4795f.b;
                if (c4801l2 == null) {
                    Intrinsics.l("service");
                    throw null;
                }
                String str3 = ((C0639v) c4801l2.g.c).a;
                y0 y0Var = (y0) c4795f.d;
                if (y0Var != null) {
                    y0Var.m((CancellationException) null);
                }
                C4801l c4801l3 = c4795f.b;
                if (c4801l3 == null) {
                    Intrinsics.l("service");
                    throw null;
                }
                c4795f.d = E.z(c4801l3.e, Mm.P.a, (C) null, new o(c4795f, str3, str2, i2, this.c, null), 2);
            }
        }
        return Unit.a;
    }
}
