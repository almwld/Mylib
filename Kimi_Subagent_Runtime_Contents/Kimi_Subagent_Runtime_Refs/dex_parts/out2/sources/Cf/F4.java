package Cf;

import Dc.C0639v;
import Dd.C0702t;
import com.google.firebase.encoders.json.BuildConfig;
import eg.C3114W;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qi.C4277e;
import ue.C4795f;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class F4 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C4801l c;
    public final /* synthetic */ Pc.v d;
    public final /* synthetic */ C0439y6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(String str, C4801l c4801l, Pc.v vVar, C0439y6 c0439y6, Vk.a aVar) {
        super(2, aVar);
        this.b = str;
        this.c = c4801l;
        this.d = vVar;
        this.e = c0439y6;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new F4(this.b, this.c, this.d, this.e, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        P3 p3 = this.e.j;
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        String str = this.b;
        if (i == 0) {
            P8.a.s(obj);
            C0702t c0702t = C0702t.a;
            this.a = 1;
            objB = c0702t.b(str, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
            objB = obj;
        }
        C3114W c3114w = (C3114W) objB;
        if (c3114w.f) {
            Pc.v vVar = (Pc.v) c3114w.c;
            if (vVar == null) {
                vVar = this.d;
            }
            Pc.v vVarA = Pc.v.a(vVar, str, null, Pc.r.d, 122);
            P1.f0 f0Var = this.c.c;
            f0Var.f = BuildConfig.FLAVOR;
            Mm.y0 y0Var = (Mm.y0) f0Var.e;
            if (y0Var != null) {
                y0Var.m((CancellationException) null);
            }
            C4277e c4277e = (C4277e) f0Var.g;
            if (c4277e == null) {
                Intrinsics.l("onEvent");
                throw null;
            }
            C4795f c4795f = (C4795f) f0Var.h;
            if (c4795f == null) {
                Intrinsics.l("chatStream");
                throw null;
            }
            c4277e.invoke(new ze.U(C0639v.a((C0639v) c4795f.c, null, null, null, null, null, null, null, vVarA, 122879)));
            p3.E0(false);
            p3.D0(false);
        }
        return Unit.a;
    }
}
