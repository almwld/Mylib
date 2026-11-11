package Hf;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.List;
import java.util.ListIterator;
import je.C3695k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Hf.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1074b3 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ A3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074b3(A3 a3, Vk.a aVar) {
        super(2, aVar);
        this.b = a3;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        C1074b3 c1074b3 = new C1074b3(this.b, aVar);
        c1074b3.a = obj;
        return c1074b3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Cf.D0) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objPrevious;
        Dc.N n;
        String str;
        Cf.D0 d0 = (Cf.D0) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        A3 a3 = this.b;
        Cf.P3 p3 = a3.j;
        p3.y0.j(false);
        List list = p3.j().a;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C3695k0 c3695k0 = (C3695k0) objPrevious;
            C3695k0 c3695k02 = C3695k0.h;
            if (c3695k0.v(true) && c3695k0.n()) {
                break;
            }
        }
        C3695k0 c3695k03 = (C3695k0) objPrevious;
        p3.y0.g(new Gf.F1((c3695k03 == null || (n = c3695k03.a) == null || (str = n.a) == null) ? BuildConfig.FLAVOR : str, null, false, d0.a, 30));
        String str2 = d0.a;
        int i = A3.m;
        a3.I(str2, BuildConfig.FLAVOR);
        Ae.f fVar = Ae.f.a;
        Ae.f.e(p3.p(), true, false);
        return Unit.a;
    }
}
