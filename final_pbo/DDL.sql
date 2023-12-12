DDL pada PostgreSQL
-- This script was generated by the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE IF NOT EXISTS public.buku
(
    id character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nama character varying(30) COLLATE pg_catalog."default",
    angkatan character varying(4) COLLATE pg_catalog."default",
    isbn character varying(10) COLLATE pg_catalog."default" NOT NULL,
    judul character varying(100) COLLATE pg_catalog."default",
    pengarang character varying(30) COLLATE pg_catalog."default",
    penerbit character varying(30) COLLATE pg_catalog."default",
    tahun_terbit character varying(4) COLLATE pg_catalog."default",
    kategori character varying(100) COLLATE pg_catalog."default",
    jumlah_halaman character varying(1000) COLLATE pg_catalog."default",
    jumlah_buku character varying(20) COLLATE pg_catalog."default",
    sub_judul character varying(100) COLLATE pg_catalog."default",
    tanggal date,
    CONSTRAINT isbn PRIMARY KEY (isbn)
);

CREATE TABLE IF NOT EXISTS public.peminjaman_buku
(
    id character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nama character varying(30) COLLATE pg_catalog."default",
    angkatan character varying(4) COLLATE pg_catalog."default",
    isbn character varying(10) COLLATE pg_catalog."default" NOT NULL,
    judul_buku character varying(100) COLLATE pg_catalog."default",
    kategori character varying(50) COLLATE pg_catalog."default",
    tanggal date,
    jumlah character varying(30) COLLATE pg_catalog."default",
    status character varying(10) COLLATE pg_catalog."default",
    CONSTRAINT peminjaman_buku_pkey PRIMARY KEY (isbn)
);

CREATE TABLE IF NOT EXISTS public.peminjaman_skripsi
(
    id character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nama character varying(30) COLLATE pg_catalog."default",
    angkatan character varying(4) COLLATE pg_catalog."default",
    id_skripsi character varying(10) COLLATE pg_catalog."default" NOT NULL,
    judul_skripsi character varying(100) COLLATE pg_catalog."default",
    tanggal date,
    jumlah character varying(20) COLLATE pg_catalog."default",
    status character varying(10) COLLATE pg_catalog."default",
    CONSTRAINT peminjaman_skripsi_pkey PRIMARY KEY (id_skripsi)
);

CREATE TABLE IF NOT EXISTS public.pengguna
(
    id character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nama character varying(30) COLLATE pg_catalog."default",
    pasword character varying(10) COLLATE pg_catalog."default",
    CONSTRAINT pengguna_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.skripsi
(
    id character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nama character varying(30) COLLATE pg_catalog."default",
    angkatan character varying(4) COLLATE pg_catalog."default",
    id_skripsi character varying(10) COLLATE pg_catalog."default" NOT NULL,
    judul_skripsi character varying(150) COLLATE pg_catalog."default",
    tahun_terbit character varying(4) COLLATE pg_catalog."default",
    jumlah_halaman character varying(500) COLLATE pg_catalog."default",
    tanggal date,
    CONSTRAINT skripsi_pkey PRIMARY KEY (id_skripsi)
);

ALTER TABLE IF EXISTS public.peminjaman_buku
    ADD CONSTRAINT peminjaman_buku_isbn_fkey FOREIGN KEY (isbn)
    REFERENCES public.buku (isbn) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;
CREATE INDEX IF NOT EXISTS peminjaman_buku_pkey
    ON public.peminjaman_buku(isbn);


ALTER TABLE IF EXISTS public.peminjaman_skripsi
    ADD CONSTRAINT peminjaman_skripsi_id_skripsi_fkey FOREIGN KEY (id_skripsi)
    REFERENCES public.skripsi (id_skripsi) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;
CREATE INDEX IF NOT EXISTS peminjaman_skripsi_pkey
    ON public.peminjaman_skripsi(id_skripsi);

END;