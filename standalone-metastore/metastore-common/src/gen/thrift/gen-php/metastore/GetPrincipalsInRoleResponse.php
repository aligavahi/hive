<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class GetPrincipalsInRoleResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'principalGrants',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\RolePrincipalGrant',
                ),
        ),
    );

    /**
     * @var \metastore\RolePrincipalGrant[]
     */
    public $principalGrants = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['principalGrants'])) {
                $this->principalGrants = $vals['principalGrants'];
            }
        }
    }

    public function getName()
    {
        return 'GetPrincipalsInRoleResponse';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->principalGrants = array();
                        $_size134 = 0;
                        $_etype137 = 0;
                        $xfer += $input->readListBegin($_etype137, $_size134);
                        for ($_i138 = 0; $_i138 < $_size134; ++$_i138) {
                            $elem139 = null;
                            $elem139 = new \metastore\RolePrincipalGrant();
                            $xfer += $elem139->read($input);
                            $this->principalGrants []= $elem139;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('GetPrincipalsInRoleResponse');
        if ($this->principalGrants !== null) {
            if (!is_array($this->principalGrants)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('principalGrants', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->principalGrants));
            foreach ($this->principalGrants as $iter140) {
                $xfer += $iter140->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
