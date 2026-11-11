package Ul;

import am.InterfaceC0559p;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public enum Y implements InterfaceC0559p {
    IN(0),
    OUT(1),
    INV(2);

    public final int a;

    Y(int i) {
        this.a = i;
    }

    @Override // am.InterfaceC0559p
    public final int getNumber() {
        return this.a;
    }
}
