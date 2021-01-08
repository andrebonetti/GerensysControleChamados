export interface EmpresaDTO {
    id:number,
    cnpj: number,
    razaoSocial:string,
    imagem : string
}

export interface EmpresaCompleteGridDTO {
  id:number,
  ativo: number,
  usuarioCriacao:any,
  usuarioModificaocao : any,
  dataCriacao: any,
  dataModificacao: null,
  cnpj: number,
  razaoSocial: string,
  imagem: string
}

