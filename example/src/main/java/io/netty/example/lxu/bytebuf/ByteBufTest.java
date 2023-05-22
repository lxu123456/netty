package io.netty.example.lxu.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpRequestDecoder;
import sun.nio.ch.DirectBuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Optional;

public class ByteBufTest {
    public static void main(String[] args) {
        ByteBuf buf = ByteBufAllocator.DEFAULT.buffer(16);
        buf.writeBytes(new byte[]{'a','b','c','d'});
        System.out.println(buf);
        System.out.println(buf.readableBytes());
        byte b = buf.readByte();
        System.out.println(b);
        System.out.println(buf.readableBytes());
        System.out.println(buf.writerIndex());

        HttpClientCodec httpClientCodec = new HttpClientCodec();
        HttpRequestDecoder httpRequestDecoder = new HttpRequestDecoder();
        System.out.println(Optional.ofNullable("aaa").orElse(null));

    }
}
