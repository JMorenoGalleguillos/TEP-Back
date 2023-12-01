-- Table: public.empresas

-- DROP TABLE IF EXISTS public.empresas;

CREATE TABLE IF NOT EXISTS public.empresas
(
    id integer NOT NULL,
    direccion character varying(255) COLLATE pg_catalog."default",
    nombre character varying(255) COLLATE pg_catalog."default",
    rut character varying(255) COLLATE pg_catalog."default",
    telefono character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT empresas_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.empresas
    OWNER to postgres;
	
	
	
	--------------------------
	
	
	INSERT INTO public.empresas(
	id, direccion, nombre, rut, telefono)
	VALUES (?, ?, ?, ?, ?);
	
	
	
	--------------------------
	
	
1,Calle A #123,Empresa A,123456789,+56987654321
2,Avenida B #456,Empresa B,234567890,+56876543210
3,Carrera C #789,Empresa C,345678901,+56765432109
4,Pasaje D #012,Empresa D,456789012,+56654321098