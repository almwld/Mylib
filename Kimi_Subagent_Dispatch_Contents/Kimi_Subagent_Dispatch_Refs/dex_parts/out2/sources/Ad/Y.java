package Ad;

import Cd.C0191o;
import ag.AbstractC2393b;
import com.google.firebase.encoders.json.BuildConfig;
import com.moonshot.kimichat.KimiApplication;
import dg.C2978a;
import kg.EnumC3812a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mg.AbstractC4002a;
import qg.C4272k;
import vb.N2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public final Vk.a create(Object obj, Vk.a aVar) {
        return new Y(2, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        Uf.g gVar = AbstractC2393b.b;
        String string = BuildConfig.FLAVOR;
        String strP = gVar.p("key_user_chat_stuff_info", BuildConfig.FLAVOR);
        if (strP.length() > 0) {
            String str = a0.a;
            Zf.f fVar = Zf.f.a;
            try {
            } catch (Throwable th2) {
                boolean z = C2978a.a;
                C2978a.b("KimiJson", null, new V(1, strP, th2));
            }
            if (strP.length() == 0) {
                objA = null;
            } else {
                kn.t tVar = Zf.f.c;
                tVar.getClass();
                objA = tVar.a(N2.j(C0191o.Companion.serializer()), strP);
            }
            C0191o c0191o = (C0191o) objA;
            if (c0191o == null) {
                return Unit.a;
            }
            a0.b = c0191o;
        }
        AbstractC4002a.a();
        KimiApplication kimiApplication = Pf.B.a;
        C4272k c4272k = C4272k.b;
        String strE = a0.b.a;
        if (strE.length() == 0) {
            a0.b.b = 1L;
            strE = c4272k.e();
        }
        C0191o c0191o2 = a0.b;
        String strE2 = c4272k.e();
        c0191o2.getClass();
        Intrinsics.checkNotNullParameter(strE2, "<set-?>");
        c0191o2.a = strE2;
        EnumC3812a enumC3812a = EnumC3812a.b;
        Long lB = c4272k.b(strE);
        if (lB != null) {
            long jLongValue = lB.longValue();
            if (!c4272k.m(jLongValue)) {
                if (c4272k.n(jLongValue)) {
                    a0.b.b++;
                } else {
                    a0.b.b = 1L;
                }
            }
        }
        Zf.f fVar2 = Zf.f.a;
        C0191o c0191o3 = a0.b;
        try {
            kn.t tVar2 = Zf.f.c;
            tVar2.getClass();
            string = tVar2.b(C0191o.Companion.serializer(), c0191o3).toString();
        } catch (Throwable th3) {
            boolean z2 = C2978a.a;
            C2978a.b("KimiJson", null, new W(th3, c0191o3, 1));
        }
        boolean z3 = C2978a.a;
        C2978a.a("UserChatStuffManager", null, new C0085a(string, 2));
        AbstractC2393b.b.v("key_user_chat_stuff_info", string);
        return Unit.a;
    }
}
